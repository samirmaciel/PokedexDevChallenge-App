package com.samirmaciel.pokedexdevchallenge.feature.presentation.HomeScreen

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.samirmaciel.pokedexdevchallenge.feature.domain.model.PokemonEntry
import com.samirmaciel.pokedexdevchallenge.feature.domain.repository.RepositoryDataPokemon
import com.samirmaciel.pokedexdevchallenge.feature.util.Resource
import com.samirmaciel.pokedexdevchallenge.feature.util.getColor
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import java.util.*
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    val repository : RepositoryDataPokemon
) : ViewModel(){

    var pageSize = 150
    var offset = 0

    var pokemonList : MutableLiveData<MutableList<PokemonEntry>> = MutableLiveData()


    @RequiresApi(Build.VERSION_CODES.N)
    fun getPokemonList() {

        viewModelScope.launch {

            val pokemonListResult = repository.getPokemonList(pageSize, offset)

            when(pokemonListResult){

                is Resource.Success -> {
                    val tempList = mutableListOf<PokemonEntry>()

                    val pokemonEntry = pokemonListResult.data!!.results.mapIndexed{ index, entry ->

                        val pokemonID = if(entry.url.endsWith("/")){
                            entry.url.dropLast(1).takeLastWhile { it.isDigit() }
                        }else{
                            entry.url.takeLastWhile { it.isDigit() }
                        }

                        val pokemonResult = repository.getPokemonById(pokemonID.toInt())

                        var pokemonColor = 0

                        when(pokemonResult){

                            is Resource.Success -> { pokemonColor = getColor(pokemonResult.data!!.types[0].type.name)}

                            is Resource.Error -> { }
                        }

                        val imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/${pokemonID}.png"


                        tempList.add(PokemonEntry(entry.name.capitalize(Locale.ROOT), pokemonID.toInt(), pokemonColor, imageUrl))
                    }

                    pokemonList.postValue(tempList)

                    offset =+ pageSize
                    pageSize =+ 20
                }

                is Resource.Error -> {

                }
            }
        }
    }


}
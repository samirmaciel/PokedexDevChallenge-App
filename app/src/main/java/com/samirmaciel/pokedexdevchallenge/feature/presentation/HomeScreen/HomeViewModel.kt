package com.samirmaciel.pokedexdevchallenge.feature.presentation.HomeScreen

import android.os.Build
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.samirmaciel.pokedexdevchallenge.feature.data.remote.response.Pokemon
import com.samirmaciel.pokedexdevchallenge.feature.data.remote.response.PokemonList
import com.samirmaciel.pokedexdevchallenge.feature.domain.model.PokemonEntry
import com.samirmaciel.pokedexdevchallenge.feature.domain.repository.RepositoryDataPokemon
import com.samirmaciel.pokedexdevchallenge.feature.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import java.util.*
import javax.inject.Inject

@RequiresApi(Build.VERSION_CODES.N)
@HiltViewModel
class HomeViewModel @Inject constructor(
    val repository : RepositoryDataPokemon
) : ViewModel(){

    var limit = 20
    var offset = 0
    var currentProgress = 0


    var pokemonList : MutableLiveData<MutableList<PokemonEntry>> = MutableLiveData()
    var pokemonBaseList : MutableList<PokemonEntry> = mutableListOf()
    var pokemonSearchList : MutableLiveData<MutableList<PokemonEntry>> = MutableLiveData()

    init {
        getPokemonList()
    }
    
    @RequiresApi(Build.VERSION_CODES.N)
    fun getPokemonList() {

        viewModelScope.launch {

            val result = repository.getPokemonList(limit, offset)

            when(result){

                is Resource.Success -> {
                    val pokemonEntryList = result.data!!.results.mapIndexed { index, result ->

                        val id = if(result.url.endsWith("/")){
                            result.url.dropLast(1).takeLastWhile { it.isDigit() }
                        }else{
                            result.url.takeLastWhile { it.isDigit() }
                        }
                        PokemonEntry(
                            id = id.toInt(),
                            name = result.name
                        )
                    }.toMutableList()

                    pokemonEntryList.forEach{

                    }
                    pokemonBaseList.addAll(pokemonEntryList)
                    pokemonList.postValue(pokemonEntryList)
                    currentProgress += pokemonEntryList.size
                }

                is Resource.Error -> {

                    pokemonList.postValue(mutableListOf())
                }
            }

            offset += limit
        }
    }

    fun searchPokemon(name : String){
        pokemonSearchList.value = pokemonBaseList.filter {
            it.name.contains(name, true)
        }.toMutableList()

    }
}
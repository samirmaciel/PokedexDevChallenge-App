package com.samirmaciel.pokedexdevchallenge.feature.presentation.HomeScreen

import android.os.Build
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.samirmaciel.pokedexdevchallenge.feature.data.remote.response.Pokemon
import com.samirmaciel.pokedexdevchallenge.feature.domain.model.PokemonEntry
import com.samirmaciel.pokedexdevchallenge.feature.domain.repository.RepositoryDataPokemon
import com.samirmaciel.pokedexdevchallenge.feature.util.Resource
import com.samirmaciel.pokedexdevchallenge.feature.util.getColor
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.util.*
import javax.inject.Inject

@RequiresApi(Build.VERSION_CODES.N)
@HiltViewModel
class HomeViewModel @Inject constructor(
    val repository : RepositoryDataPokemon
) : ViewModel(){

    var totalOfPokemons = 898
    var currentProgress = 0
    var progressLoadingPokemons : MutableLiveData<Int> = MutableLiveData(currentProgress)
    var currentPokemonId = 1

    var pokemonLoadingList : MutableLiveData<MutableList<Pokemon>> = MutableLiveData()
    var pokemonBaseList : MutableList<Pokemon> = mutableListOf()
    var pokemonSearchList : MutableLiveData<MutableList<Pokemon>> = MutableLiveData()
    var loadingPokemons : MutableLiveData<Boolean> = MutableLiveData(true)

    init {
        getPokemonList()
    }
    
    @RequiresApi(Build.VERSION_CODES.N)
    fun getPokemonList() {

        viewModelScope.launch {

            val pokemonListRequested = mutableListOf<Pokemon>()

            if(currentPokemonId <= totalOfPokemons) {
                for (count in 1..30) {
                    val pokemonResult = repository.getPokemonById(currentPokemonId)

                    when (pokemonResult) {

                        is Resource.Success<*> -> {
                            pokemonListRequested.add(pokemonResult.data!!)
                            pokemonBaseList.add(pokemonResult.data!!)
                        }

                        is Resource.Error<*> -> {

                        }
                    }
                    currentPokemonId++
                }
                currentProgress = currentProgress+  pokemonListRequested.size
                progressLoadingPokemons.postValue(currentProgress)
                pokemonLoadingList.postValue(pokemonListRequested)

            }else{
                loadingPokemons.postValue(false)
            }
        }
    }

    fun searchPokemon(name : String){
        pokemonSearchList.value = pokemonBaseList.filter {
            it.name.contains(name, true)
        }.toMutableList()

    }
}
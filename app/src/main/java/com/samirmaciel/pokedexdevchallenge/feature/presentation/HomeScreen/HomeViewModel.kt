package com.samirmaciel.pokedexdevchallenge.feature.presentation.HomeScreen

import android.os.Build
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.samirmaciel.pokedexdevchallenge.feature.data.remote.response.Pokemon
import com.samirmaciel.pokedexdevchallenge.feature.domain.model.PokemonEntry
import com.samirmaciel.pokedexdevchallenge.feature.domain.model.Type
import com.samirmaciel.pokedexdevchallenge.feature.domain.repository.RepositoryDataPokemon
import com.samirmaciel.pokedexdevchallenge.feature.util.Resource
import com.samirmaciel.pokedexdevchallenge.feature.util.FilterTypes
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@RequiresApi(Build.VERSION_CODES.N)
@HiltViewModel
class HomeViewModel @Inject constructor(
    val repository: RepositoryDataPokemon
) : ViewModel() {

    var limit = 20
    var offset = 0
    var totalAmountPokemon = 865
    var currentAmountPokemon = 1
    var loadingProgressNotify: MutableLiveData<Int> = MutableLiveData(0)


    var pokemonList: MutableLiveData<MutableList<Pokemon>> = MutableLiveData()
    var pokemonBaseList: MutableList<PokemonEntry> = mutableListOf()
    var pokemonSearchList: MutableLiveData<MutableList<PokemonEntry>> = MutableLiveData()

    var typesList: MutableLiveData<List<Type>> = MutableLiveData()
    var weaknessesList: MutableLiveData<List<Type>> = MutableLiveData()
    var heightList: MutableLiveData<List<Type>> = MutableLiveData()
    var weightList: MutableLiveData<List<Type>> = MutableLiveData()

    var pokemonFullBaseList: MutableList<Pokemon> = mutableListOf()

    init {
        getAllPokmeonsById(currentAmountPokemon)
        getFilterLists()
    }

//    @RequiresApi(Build.VERSION_CODES.N)
//    fun getPokemonList() {
//
//        viewModelScope.launch {
//            if(loadingProgressList < 898 ){
//                val result = repository.getPokemonList(limit, offset)
//
//                when(result){
//
//                    is Resource.Success -> {
//                        val pokemonEntryList = result.data!!.results.mapIndexed { index, result ->
//
//                            val id = if(result.url.endsWith("/")){
//                                result.url.dropLast(1).takeLastWhile { it.isDigit() }
//                            }else{
//                                result.url.takeLastWhile { it.isDigit() }
//                            }
//                            PokemonEntry(
//                                id = id.toInt(),
//                                name = result.name
//                            )
//                        }.toMutableList()
//
//                        pokemonBaseList.addAll(pokemonEntryList)
//                        loadingProgressList += pokemonEntryList.size
//                        loadingProgressNotify.postValue(loadingProgressList)
//                    }
//
//                    is Resource.Error -> {
//
//                    }
//                }
//
//                offset += limit
//
//                getPokemonList()
//            }else {
//                pokemonList.postValue(pokemonFullBaseList)
//            }
//        }
//    }

    fun getAllPokmeonsById(id: Int) {

        viewModelScope.launch {

            val response = repository.getPokemonById(id)

            when (response) {

                is Resource.Success -> {
                    pokemonFullBaseList.add(response.data!!)
                    currentAmountPokemon += 1
                    loadingProgressNotify.postValue(currentAmountPokemon)
                    if (currentAmountPokemon < totalAmountPokemon) {
                        getAllPokmeonsById(currentAmountPokemon)
                    } else {
                        pokemonList.postValue(pokemonFullBaseList)
                    }
                }

                is Resource.Error -> {
                    Log.d("ErrorApiRequest", "getAllPokmeonsById: ")
                }
            }


        }
    }

    fun searchPokemon(name: String) {
        pokemonSearchList.value = pokemonBaseList.filter {
            it.name.contains(name, true)
        }.toMutableList()

    }

    private fun getFilterLists() {
        typesList.value = FilterTypes.getTypeFilterList()
        weaknessesList.value = FilterTypes.getTypeFilterList()
        heightList.value = FilterTypes.getHeightTypes()
        weightList.value = FilterTypes.getWeightTypes()
    }
}
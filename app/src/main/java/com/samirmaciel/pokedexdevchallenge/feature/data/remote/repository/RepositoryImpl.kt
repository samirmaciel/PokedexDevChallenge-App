package com.samirmaciel.pokedexdevchallenge.feature.data.remote.repository

import com.samirmaciel.pokedexdevchallenge.feature.data.remote.response.Pokemon
import com.samirmaciel.pokedexdevchallenge.feature.data.remote.response.PokemonList
import com.samirmaciel.pokedexdevchallenge.feature.domain.repository.RepositoryDataPokemon
import com.samirmaciel.pokedexdevchallenge.feature.util.Resource
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    val pokemonRequestAPI : PokemonRequestAPI
) : RepositoryDataPokemon{
    override suspend fun getPokemonList(limit : Int, offset : Int): Resource<PokemonList> {
        val response = try{
            pokemonRequestAPI.getPokemonList(limit, offset)
        }catch (e : Exception){
            return Resource.Error("An unknow error ocurred.")
        }

        return Resource.Success(response)
    }

    override suspend fun getPokemonByName(name: String): Resource<Pokemon> {
        val response = try {
            pokemonRequestAPI.getPokemonByName(name)
        }catch (e : Exception){
            return Resource.Error("An unknow error ocurred.")
        }

        return Resource.Success(response)
    }

    override suspend fun getPokemonById(id: Int): Resource<Pokemon> {
        val response = try {
            pokemonRequestAPI.getPokemonById(id)
        }catch (e : Exception){
            return Resource.Error("An unknow error ocurred. ")
        }

        return Resource.Success(response)
    }
}
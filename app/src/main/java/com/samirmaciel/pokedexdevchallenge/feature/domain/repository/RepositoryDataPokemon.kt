package com.samirmaciel.pokedexdevchallenge.feature.domain.repository

import com.samirmaciel.pokedexdevchallenge.feature.data.remote.response.Pokemon
import com.samirmaciel.pokedexdevchallenge.feature.data.remote.response.PokemonList
import com.samirmaciel.pokedexdevchallenge.feature.util.Resource

interface RepositoryDataPokemon {

    suspend fun getPokemonList(limit : Int, offset : Int) : Resource<PokemonList>

    suspend fun getPokemonByName(name : String) : Resource<Pokemon>

    suspend fun getPokemonById(id : Int) : Resource<Pokemon>
}
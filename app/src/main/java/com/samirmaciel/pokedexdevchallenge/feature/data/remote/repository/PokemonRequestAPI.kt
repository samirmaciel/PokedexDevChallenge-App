package com.samirmaciel.pokedexdevchallenge.feature.data.remote.repository

import com.samirmaciel.pokedexdevchallenge.feature.data.remote.response.Pokemon
import com.samirmaciel.pokedexdevchallenge.feature.data.remote.response.PokemonList
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PokemonRequestAPI {

    @GET("pokemon")
    suspend fun getPokemonList(
        @Query("limit") limit : Int,
        @Query("offset") offset : Int
    ) : PokemonList

    @GET("pokemon/{name}")
    suspend fun getPokemonByName(
        @Path("name") name : String
    ) : Pokemon

    @GET("pokemon/{id}")
    suspend fun getPokemonById(
        @Path("id") id : Int
    ) : Pokemon
}
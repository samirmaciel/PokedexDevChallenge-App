package com.samirmaciel.pokedexdevchallenge.feature.di

import com.samirmaciel.pokedexdevchallenge.feature.data.remote.repository.PokemonRequestAPI
import com.samirmaciel.pokedexdevchallenge.feature.data.remote.repository.RepositoryImpl
import com.samirmaciel.pokedexdevchallenge.feature.domain.repository.RepositoryDataPokemon
import com.samirmaciel.pokedexdevchallenge.feature.util.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun providePokemonRequestAPI() : PokemonRequestAPI {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(PokemonRequestAPI::class.java)
    }

    @Singleton
    @Provides
    fun provideRepositoryDataPokemon( pokemonRequestAPI: PokemonRequestAPI ) : RepositoryDataPokemon {
        return RepositoryImpl(pokemonRequestAPI)
    }

}
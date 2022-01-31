package com.samirmaciel.pokedexdevchallenge.feature.di

import android.os.Build
import androidx.annotation.RequiresApi
import com.samirmaciel.pokedexdevchallenge.feature.data.remote.repository.PokemonRequestAPI
import com.samirmaciel.pokedexdevchallenge.feature.data.remote.repository.RepositoryPokedexImpl
import com.samirmaciel.pokedexdevchallenge.feature.domain.repository.RepositoryDataPokemon
import com.samirmaciel.pokedexdevchallenge.feature.presentation.HomeScreen.HomeViewModel
import com.samirmaciel.pokedexdevchallenge.feature.util.Constants.BASE_URL_PokedexV2
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
            .baseUrl(BASE_URL_PokedexV2)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(PokemonRequestAPI::class.java)
    }

    @Singleton
    @Provides
    fun provideRepositoryDataPokemon( pokemonRequestAPI: PokemonRequestAPI ) : RepositoryDataPokemon {
        return RepositoryPokedexImpl(pokemonRequestAPI)
    }

    @RequiresApi(Build.VERSION_CODES.N)
    @Singleton
    @Provides
    fun provideHomeViewModel(repository : RepositoryDataPokemon) : HomeViewModel{
        return HomeViewModel(repository)
    }

}
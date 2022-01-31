package com.samirmaciel.pokedexdevchallenge.feature.util

import android.os.Build
import androidx.annotation.RequiresApi
import com.samirmaciel.pokedexdevchallenge.R



    @RequiresApi(Build.VERSION_CODES.N)
    fun getColor(colorName : String) : Int {
        var color = 0
        mapColors.forEach { t, u ->
            if(t.equals(colorName, true)){
                color = u
            }
        }
        return color
    }

    val mapColors = mapOf<String, Int>(
        "water" to R.color.water,
        "grass" to R.color.grass,
        "fire" to R.color.fire,
        "electric" to R.color.electric,
        "poison" to R.color.polson,
        "ground" to R.color.ground,
        "normal" to R.color.normal,
        "fairy" to R.color.fairy,
        "ghost" to R.color.ghost,
        "bug" to R.color.bug,
        "flying" to R.color.flying,
        "dragon" to R.color.dragon,
        "steel" to R.color.steel,
        "ice" to R.color.ice,
        "rock" to R.color.rock,
        "fighting" to R.color.fighting,
        "psychic" to R.color.psychic,
        "dark" to R.color.dark,
        "default" to R.color.normal
    )

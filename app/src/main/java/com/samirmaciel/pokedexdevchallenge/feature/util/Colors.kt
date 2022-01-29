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
        "grass" to R.color.green,
        "fire" to R.color.fire,
        "electric" to R.color.electric,
        "poison" to R.color.polson,
        "ground" to R.color.ground,
        "normal" to R.color.normal,
        "fairy" to R.color.fairy,
        "ghost" to R.color.green,
        "bug" to R.color.green,
        "flying" to R.color.green,
        "dragon" to R.color.green,
        "steel" to R.color.green,
        "ice" to R.color.green,
        "rock" to R.color.green,
        "fighting" to R.color.green,
        "psychic" to R.color.green,
        "dark" to R.color.green,
    )

package com.samirmaciel.pokedexdevchallenge.feature.domain.model

data class Type(
    val drawableSelected : Int,
    val drawableUnselected: Int,
    var isSelected : Boolean = false
)

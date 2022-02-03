package com.samirmaciel.pokedexdevchallenge.feature.domain.model

data class TypeFilter(
    val drawableSelected : Int,
    val drawableUnselected: Int,
    var isSelected : Boolean = false
)

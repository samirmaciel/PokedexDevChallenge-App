package com.samirmaciel.pokedexdevchallenge.feature.data.remote.response

data class Ability(
    val ability: AbilityX,
    val is_hidden: Boolean,
    val slot: Int
)
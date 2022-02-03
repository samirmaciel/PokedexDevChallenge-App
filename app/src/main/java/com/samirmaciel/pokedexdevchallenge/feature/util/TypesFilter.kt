package com.samirmaciel.pokedexdevchallenge.feature.util

import com.samirmaciel.pokedexdevchallenge.R
import com.samirmaciel.pokedexdevchallenge.feature.domain.model.TypeFilter

object TypesFilter {

    fun getTypeFilterList() : List<TypeFilter> {
        return listOf(
            TypeFilter(
                R.drawable.ic_type_bug__selected_true,
                R.drawable.ic_type_bug__selected_false,
            ),
            TypeFilter(
                R.drawable.ic_type_dark__selected_true,
                R.drawable.ic_type_dark__selected_false,
            ),
            TypeFilter(
                R.drawable.ic_type_dragon__selected_true,
                R.drawable.ic_type_dragon__selected_false,
            ),
            TypeFilter(
                R.drawable.ic_type_electric__selected_true,
                R.drawable.ic_type_electric__selected_false,
            ),
            TypeFilter(
                R.drawable.ic_type_fairy__selected_true,
                R.drawable.ic_type_fairy__selected_false,
            ),
            TypeFilter(
                R.drawable.ic_type_fighting__selected_true,
                R.drawable.ic_type_fighting__selected_false,
            ),
            TypeFilter(
                R.drawable.ic_type_fire__selected_true,
                R.drawable.ic_type_fire__selected_false,
            ),
            TypeFilter(
                R.drawable.ic_type_flying__selected_true,
                R.drawable.ic_type_flying__selected_false,
            ),
            TypeFilter(
                R.drawable.ic_type_ghost__selected_true,
                R.drawable.ic_type_ghost__selected_false,
            ),
            TypeFilter(
                R.drawable.ic_type_grass__selected_true,
                R.drawable.ic_type_grass__selected_false,
            ),
            TypeFilter(
                R.drawable.ic_type_ground__selected_true,
                R.drawable.ic_type_ground__selected_false,
            ),
            TypeFilter(
                R.drawable.ic_type_ice__selected_true,
                R.drawable.ic_type_ice__selected_false,
            ),
            TypeFilter(
                R.drawable.ic_type_normal__selected_true,
                R.drawable.ic_type_normal__selected_false,
            ),
            TypeFilter(
                R.drawable.ic_type_poison__selected_true,
                R.drawable.ic_type_poison__selected_false,
            ),
            TypeFilter(
                R.drawable.ic_type_psychic__selected_true,
                R.drawable.ic_type_psychic__selected_false,
            ),
            TypeFilter(
                R.drawable.ic_type_rock__selected_true,
                R.drawable.ic_type_rock__selected_false,
            ),
            TypeFilter(
                R.drawable.ic_type_steel__selected_true,
                R.drawable.ic_type_steel__selected_false,
            ),
            TypeFilter(
                R.drawable.ic_type_water__selected_true,
                R.drawable.ic_type_water__selected_false,
            ),

        )
    }
}
package com.samirmaciel.pokedexdevchallenge.feature.presentation.DetailScreen.StatsScreen

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.samirmaciel.pokedexdevchallenge.R
import com.samirmaciel.pokedexdevchallenge.databinding.FragmentStatsBinding

class StatsFragment : Fragment(R.layout.fragment_stats) {

    private var _binding : FragmentStatsBinding? = null
    private val binding : FragmentStatsBinding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentStatsBinding.bind(view)
    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }
}
package com.samirmaciel.pokedexdevchallenge.feature.presentation.DetailScreen.AboutScreen

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.samirmaciel.pokedexdevchallenge.R
import com.samirmaciel.pokedexdevchallenge.databinding.FragmentAboutBinding

class AboutFragment : Fragment(R.layout.fragment_about) {

    private var _binding : FragmentAboutBinding? = null
    private val binding : FragmentAboutBinding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentAboutBinding.bind(view)
    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }
}
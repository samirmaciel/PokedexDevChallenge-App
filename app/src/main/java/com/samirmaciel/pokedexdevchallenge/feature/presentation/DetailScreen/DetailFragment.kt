package com.samirmaciel.pokedexdevchallenge.feature.presentation.DetailScreen

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayoutMediator
import com.samirmaciel.pokedexdevchallenge.R
import com.samirmaciel.pokedexdevchallenge.databinding.FragmentDetailBinding
import com.samirmaciel.pokedexdevchallenge.feature.util.TabPagerAdapter

class DetailFragment : Fragment(R.layout.fragment_detail) {

    private var _binding : FragmentDetailBinding? = null
    private val binding : FragmentDetailBinding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentDetailBinding.bind(view)
    }

    override fun onResume() {
        super.onResume()


    }

    private fun initComponents(){
        val adapter = TabPagerAdapter(childFragmentManager, lifecycle)
        binding.viewPager2.adapter = adapter

        TabLayoutMediator(binding.tabLayout, binding.viewPager2){ tab, position ->

            when(position){
                0 -> tab.text = "About"
                1 -> tab.text = "Stats"
                2 -> tab.text = "Evolution"
            }
        }
    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }
}

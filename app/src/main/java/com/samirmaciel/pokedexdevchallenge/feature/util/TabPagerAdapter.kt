package com.samirmaciel.pokedexdevchallenge.feature.util

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.samirmaciel.pokedexdevchallenge.feature.presentation.DetailScreen.AboutScreen.AboutFragment
import com.samirmaciel.pokedexdevchallenge.feature.presentation.DetailScreen.StatsScreen.StatsFragment

class TabPagerAdapter(private val fm : FragmentManager, private val lifecycle: Lifecycle) : FragmentStateAdapter(fm, lifecycle) {

    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){

            0 -> AboutFragment()

            1 -> StatsFragment()

            2 -> Fragment()

            else -> Fragment()
        }
    }
}
package com.samirmaciel.pokedexdevchallenge.feature.presentation.HomeScreen

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.samirmaciel.pokedexdevchallenge.R
import com.samirmaciel.pokedexdevchallenge.databinding.FragmentHomeBinding
import com.samirmaciel.pokedexdevchallenge.feature.util.PokemonHomeRecyclerViewAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : Fragment(R.layout.fragment_home) {

    private var _binding : FragmentHomeBinding? = null
    private val binding : FragmentHomeBinding get() = _binding!!
    private val viewModel : HomeViewModel by viewModels()
    private lateinit var recyclerViewAdapter : PokemonHomeRecyclerViewAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentHomeBinding.bind(view)

        initComponents()
    }

    @RequiresApi(Build.VERSION_CODES.N)
    @SuppressLint("NotifyDataSetChanged")
    override fun onResume() {
        super.onResume()

        viewModel.getPokemonList()

        viewModel.pokemonList.observe(this){
            recyclerViewAdapter.itemList.addAll(it)
            recyclerViewAdapter.notifyDataSetChanged()
        }
    }

    private fun initComponents(){
        recyclerViewAdapter = PokemonHomeRecyclerViewAdapter {

        }
        binding.rvPokemonList.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        binding.rvPokemonList.adapter = recyclerViewAdapter
    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }
}
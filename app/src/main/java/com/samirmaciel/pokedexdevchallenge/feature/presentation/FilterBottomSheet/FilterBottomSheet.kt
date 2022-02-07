package com.samirmaciel.pokedexdevchallenge.feature.presentation.FilterBottomSheet

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.samirmaciel.pokedexdevchallenge.R
import com.samirmaciel.pokedexdevchallenge.databinding.BottomsheetFiltersBinding
import com.samirmaciel.pokedexdevchallenge.feature.presentation.HomeScreen.HomeViewModel
import com.samirmaciel.pokedexdevchallenge.feature.util.FilterTypesRecyclerAdapter

class FilterBottomSheet : BottomSheetDialogFragment()  {

    private var _binding : BottomsheetFiltersBinding? = null
    private val binding : BottomsheetFiltersBinding get() = _binding!!
    lateinit var typesFilterAdapter : FilterTypesRecyclerAdapter
    lateinit var weaknessesFilterAdapter : FilterTypesRecyclerAdapter

    private val viewModel : HomeViewModel by viewModels({requireParentFragment()})

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = BottomsheetFiltersBinding.bind(inflater.inflate(R.layout.bottomsheet_filters, container, false))
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initSettingsBottomSheet()
        initComponents()
        setStyle(STYLE_NORMAL, R.style.MyBottomSheetDialogTheme)
    }


    override fun onResume() {
        super.onResume()
        viewModel.filterTypesList.observe(this) {
            typesFilterAdapter.itemList = it
            typesFilterAdapter.notifyDataSetChanged()
        }

        viewModel.filterWeaknessesList.observe(this){
            weaknessesFilterAdapter.itemList = it
            typesFilterAdapter.notifyDataSetChanged()
        }

        binding.rsRangernumber.addOnChangeListener { rangeSlider, value, fromUser ->
            val values = rangeSlider.values
                binding.tvStartRange.text = values[0].toInt().toString()
                binding.tvEndRange.text = values[1].toInt().toString()
        }
    }


    private fun initSettingsBottomSheet(){
        val bottomsheet = dialog as? BottomSheetDialog
        bottomsheet?.behavior?.apply {
            isFitToContents = true
            state = BottomSheetBehavior.STATE_EXPANDED
        }
    }

    private fun initComponents(){
        binding.rsRangernumber.setValues(1f, 149f)

        typesFilterAdapter = FilterTypesRecyclerAdapter { position ->
//            viewModel.filterTypesList.value!![position].isSelected = !viewModel.filterTypesList.value!![position].isSelected
        }
        binding.rvFilters.adapter = typesFilterAdapter
        binding.rvFilters.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)

        weaknessesFilterAdapter = FilterTypesRecyclerAdapter { position ->

        }

        binding.rvWeaknesses.adapter = weaknessesFilterAdapter
        binding.rvWeaknesses.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
    }


}
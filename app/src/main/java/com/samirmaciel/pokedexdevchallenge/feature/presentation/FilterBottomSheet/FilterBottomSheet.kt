package com.samirmaciel.pokedexdevchallenge.feature.presentation.FilterBottomSheet

import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
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
    lateinit var heightFilterAdapter : FilterTypesRecyclerAdapter
    lateinit var weightFilterAdapter : FilterTypesRecyclerAdapter

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
        setStyle(STYLE_NORMAL, R.style.MyBottomSheetDialogTheme)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initSettingsBottomSheet()
        initComponents()
    }


    @RequiresApi(Build.VERSION_CODES.N)
    override fun onResume() {
        super.onResume()

        binding.btnApply.setOnClickListener{
            dismiss()
        }

        binding.btnCancel.setOnClickListener{
            dismiss()
        }

        viewModel.typesList.observe(this) {
            typesFilterAdapter.itemList = it
            typesFilterAdapter.notifyDataSetChanged()
        }

        viewModel.weaknessesList.observe(this){
            weaknessesFilterAdapter.itemList = it
            typesFilterAdapter.notifyDataSetChanged()
        }

        viewModel.heightList.observe(this){
            heightFilterAdapter.itemList = it
            heightFilterAdapter.notifyDataSetChanged()
        }

        viewModel.weightList.observe(this){
            weightFilterAdapter.itemList = it
            weightFilterAdapter.notifyDataSetChanged()
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

        }
        binding.rvFilters.adapter = typesFilterAdapter
        binding.rvFilters.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)

        weaknessesFilterAdapter = FilterTypesRecyclerAdapter { position ->

        }

        binding.rvWeaknesses.adapter = weaknessesFilterAdapter
        binding.rvWeaknesses.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)

        heightFilterAdapter = FilterTypesRecyclerAdapter{

        }

        binding.rvHeight.adapter = heightFilterAdapter
        binding.rvHeight.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)

        weightFilterAdapter = FilterTypesRecyclerAdapter {
        }

        binding.rvWeights.adapter = weightFilterAdapter
        binding.rvWeights.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)

    }


}
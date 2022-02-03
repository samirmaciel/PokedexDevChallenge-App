package com.samirmaciel.pokedexdevchallenge.feature.util

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.samirmaciel.pokedexdevchallenge.R
import com.samirmaciel.pokedexdevchallenge.feature.domain.model.TypeFilter

class FilterTypesRecyclerAdapter(val itemClick : (Int) -> Unit) : RecyclerView.Adapter<FilterTypesRecyclerAdapter.MyViewHolder>() {

    var itemList : List<TypeFilter> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_rv_fitlertypes, parent, false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bindItem(position, itemClick)
    }

    override fun getItemCount() = itemList.size

    inner class MyViewHolder(private val itemView : View) : RecyclerView.ViewHolder(itemView){

        fun bindItem(position : Int, itemClick : (Int) -> Unit){

            val icon = itemView.findViewById<ImageView>(R.id.ivTypeIcon)

            updateIcon(itemList[position], icon)

            icon.setOnClickListener{
                itemClick(position)
                itemList[position].isSelected = !itemList[position].isSelected
                updateIcon(itemList[position], icon)
            }
        }

        fun updateIcon(item : TypeFilter, icon : ImageView){
            if(item.isSelected){
                icon.setImageResource(item.drawableSelected)
            }else{
                icon.setImageResource(item.drawableUnselected)
            }
        }
    }
}
package com.samirmaciel.pokedexdevchallenge.feature.util

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.samirmaciel.pokedexdevchallenge.R
import com.samirmaciel.pokedexdevchallenge.feature.domain.model.PokemonEntry


class PokemonHomeRecyclerViewAdapter(private val itemClick : () -> Unit) : RecyclerView.Adapter<PokemonHomeRecyclerViewAdapter.MyViewHolder>() {

    var itemList : MutableList<PokemonEntry> = mutableListOf()

    class MyViewHolder(val itemView : View, val context : Context) : RecyclerView.ViewHolder(itemView) {

        fun bindItem(item : PokemonEntry, itemClick: () -> Unit){

            itemView.findViewById<TextView>(R.id.tvPokemonName).text = item.name
            itemView.findViewById<TextView>(R.id.tvPokemonNumber).text = "#${item.id}"

            Glide.with(itemView).load(item.imageUrl).into(itemView.findViewById<ImageView>(R.id.ivPokemonImage))
            itemView.findViewById<CardView>(R.id.cardviewPokemon).setCardBackgroundColor(context.resources.getColor(item.color))
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_rv_home, parent, false), parent.context)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bindItem(itemList[position], itemClick)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }
}
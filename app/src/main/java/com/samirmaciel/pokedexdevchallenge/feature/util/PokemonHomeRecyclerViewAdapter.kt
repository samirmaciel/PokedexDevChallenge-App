package com.samirmaciel.pokedexdevchallenge.feature.util

import android.annotation.SuppressLint
import android.content.Context
import android.os.Build
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.samirmaciel.pokedexdevchallenge.R
import com.samirmaciel.pokedexdevchallenge.feature.data.remote.response.Pokemon
import com.samirmaciel.pokedexdevchallenge.feature.domain.model.PokemonEntry


class PokemonHomeRecyclerViewAdapter(private val itemClick : () -> Unit) : RecyclerView.Adapter<PokemonHomeRecyclerViewAdapter.MyViewHolder>() {

    var itemList : MutableList<Pokemon> = mutableListOf()

    class MyViewHolder(val itemView : View, val context : Context) : RecyclerView.ViewHolder(itemView) {

        @RequiresApi(Build.VERSION_CODES.N)
        fun bindItem(item : Pokemon, itemClick: () -> Unit){

            itemView.findViewById<TextView>(R.id.tvPokemonName).text = item.name
            itemView.findViewById<TextView>(R.id.tvPokemonNumber).text = "#${item.id}"

            val imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/${item.id}.png"

            val color = getColor(item.types[0].type.name)

            Glide.with(itemView).load(imageUrl).into(itemView.findViewById<ImageView>(R.id.ivPokemonImage))
            itemView.findViewById<CardView>(R.id.cardviewPokemon).setCardBackgroundColor(context.resources.getColor(color))
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_rv_home, parent, false), parent.context)
    }

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bindItem(itemList[position], itemClick)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }
}
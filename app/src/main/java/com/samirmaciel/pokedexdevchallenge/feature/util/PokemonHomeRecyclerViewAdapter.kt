package com.samirmaciel.pokedexdevchallenge.feature.util

import android.content.Context
import android.os.Build
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
import java.util.*


class PokemonHomeRecyclerViewAdapter(private val itemClick : () -> Unit) : RecyclerView.Adapter<PokemonHomeRecyclerViewAdapter.MyViewHolder>() {

    var itemList : MutableList<Pokemon> = mutableListOf()

    class MyViewHolder(val itemView : View, val context : Context) : RecyclerView.ViewHolder(itemView) {

        @RequiresApi(Build.VERSION_CODES.N)
        fun bindItem(item : Pokemon, itemClick: () -> Unit){

            val ivType1 = itemView.findViewById<ImageView>(R.id.ivTypeIcon1)
            val ivType2 = itemView.findViewById<ImageView>(R.id.ivTypeIcon2)
            itemView.findViewById<TextView>(R.id.tvPokemonName).text = item.name.capitalize(Locale.ROOT)
            itemView.findViewById<TextView>(R.id.tvPokemonNumber).text = "#${item.id.toString().padStart(3, '0')}"

            val imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/${item.id}.png"

            if(getPokemonType(item.types[0].type.name) != null){
                ivType1.setImageResource(getPokemonType(item.types[0].type.name)!!)
                if (item.types.size > 1 && getPokemonType(item.types[1].type.name) != null){
                    ivType2.setImageResource(getPokemonType(item.types[1].type.name)!!)
                    ivType2.visibility = View.VISIBLE
                }
            }else{
                if (item.types.size > 1 && getPokemonType(item.types[1].type.name) != null){
                    ivType1.setImageResource(getPokemonType(item.types[1].type.name)!!)
                }
            }

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
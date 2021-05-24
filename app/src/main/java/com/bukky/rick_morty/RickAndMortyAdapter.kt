package com.bukky.rick_morty

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class RickAndMortyAdapter(): RecyclerView.Adapter<RickAndMortyAdapter.RickAndMortyViewHolder>() {

        private val characters = mutableListOf<Result>()

    inner class RickAndMortyViewHolder(
        itemView: View
    ):RecyclerView.ViewHolder(itemView){
        var characterName: TextView = itemView.findViewById(R.id.character_name)
        var characterSpecie: TextView = itemView.findViewById(R.id.character_specie)
        var characterImage: ImageView = itemView.findViewById(R.id.character_image)
        var characterStatus: ImageView = itemView.findViewById(R.id.character_image)
    }

    fun submitCharacter(newCharacters: List<Result>){
    if ()
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RickAndMortyViewHolder {
        return RickAndMortyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.layout_item,parent,false))
    }

    override fun onBindViewHolder(holder: RickAndMortyViewHolder, position: Int) {
        holder.characterName.text = characters(position).name
        holder.characterSpecie.text = characters(position).specie
        holder.characterStatus.text = characters(position).status
        Glide.with(holder.characterImage.context)
            .load(characters[position].image)
            .centerCrop()
            .into(holder.characterImage)


    }

    override fun getItemCount(): Int {
        return characters.size

    }
}
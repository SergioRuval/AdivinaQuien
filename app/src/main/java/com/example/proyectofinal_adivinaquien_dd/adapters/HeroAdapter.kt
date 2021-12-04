package com.example.proyectofinal_adivinaquien_dd.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.proyectofinal_adivinaquien_dd.R
import com.example.proyectofinal_adivinaquien_dd.objects.SuperHero

class HeroAdapter (val superhero: List<SuperHero>): RecyclerView.Adapter<HeroAdapter.HeroHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return HeroHolder(layoutInflater.inflate(R.layout.item_superhero, parent, false))
    }

    override fun onBindViewHolder(holder: HeroHolder, position: Int) {
        holder.render(superhero[position])
    }

    override fun getItemCount(): Int = superhero.size

    class HeroHolder(val view: View):RecyclerView.ViewHolder(view){
        fun render(superhero: SuperHero){
            view.findViewById<TextView>(R.id.realName).text = superhero.superHeroName
            view.findViewById<TextView>(R.id.biografia).text = superhero.biography
            view.findViewById<ImageView>(R.id.imagen).setImageResource(superhero.image)
        }
    }
}
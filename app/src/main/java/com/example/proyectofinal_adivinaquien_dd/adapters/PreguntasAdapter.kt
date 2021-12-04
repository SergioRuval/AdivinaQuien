package com.example.proyectofinal_adivinaquien_dd.adapters

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.proyectofinal_adivinaquien_dd.R
import com.example.proyectofinal_adivinaquien_dd.tools.HerramientaCaracteristica
import com.example.proyectofinal_adivinaquien_dd.viewmodels.PreguntaViewModel

class PreguntasAdapter( private val viewModel : PreguntaViewModel, private val listaParametros : Array<String>)
    : RecyclerView.Adapter<PreguntasAdapter.PreguntasViewHolder>() {

    class PreguntasViewHolder(val item : View, viewModel: PreguntaViewModel) : RecyclerView.ViewHolder(item) {
        val herramienta = HerramientaCaracteristica(item.context)
        val preguntaTxt : Button = item.findViewById(R.id.pregunta_txt) as Button
        val model = viewModel

        fun bindPregunta(pregunta : String){
            preguntaTxt.text = pregunta
            preguntaTxt.setOnClickListener {
                val button = it as Button
                Log.e("ID array", R.array.categorias.toString())
                val caracteristica = herramienta.getCaracteristicaFromPregunta(button.text.toString())
                model.selectPregunta(caracteristica)
            }
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PreguntasViewHolder {
        val item = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_pregunta, parent, false) as LinearLayout
        return  PreguntasViewHolder(item, viewModel)
    }

    override fun onBindViewHolder(holder: PreguntasViewHolder, position: Int) {
        val pregunta = listaParametros[position]
        holder.bindPregunta(pregunta)
    }

    override fun getItemCount(): Int = listaParametros.size
}
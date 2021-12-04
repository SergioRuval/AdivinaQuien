package com.example.proyectofinal_adivinaquien_dd.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.proyectofinal_adivinaquien_dd.R
import com.example.proyectofinal_adivinaquien_dd.adapters.PreguntasAdapter
import com.example.proyectofinal_adivinaquien_dd.viewmodels.CategoriaViewModel
import com.example.proyectofinal_adivinaquien_dd.viewmodels.PreguntaViewModel

class PreguntasFragment : Fragment(){

    private lateinit var preguntas : Array<String>
    private var pastID : Int = 0

    private val model : CategoriaViewModel by activityViewModels()
    private val viewModel : PreguntaViewModel by activityViewModels()

    companion object {
        fun newInstance() : PreguntasFragment {
            return PreguntasFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_preguntas, container, false)
        model.botonesCategoria.observe(viewLifecycleOwner, Observer<Button> { item ->

            val actvty = activity as Context

            pastID = item.id

            when(item.id){
                R.id.btnSombrero -> preguntas = resources.getStringArray(R.array.SombreroCategoria)
                R.id.btnSexo -> preguntas = resources.getStringArray(R.array.SexoCategoria)
                R.id.btnPiel -> preguntas = resources.getStringArray(R.array.PielCategoria)
                R.id.btnTatuaje -> preguntas = resources.getStringArray(R.array.TatuajesCategoria)
                R.id.btnAccesorio -> preguntas = resources.getStringArray(R.array.AccesorioCategoria)
                R.id.btnCabello -> preguntas = resources.getStringArray(R.array.CabelloCategoria)
                R.id.btnLentes -> preguntas = resources.getStringArray(R.array.AnteojosCategoria)
                R.id.btnMascara -> preguntas = resources.getStringArray(R.array.MascaraCategoria)
            }

            val adaptador = PreguntasAdapter(viewModel, preguntas)

            val recyclerView = view.findViewById<RecyclerView>(R.id.recViewPreguntas)
            recyclerView.layoutManager =
                LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
            recyclerView.adapter = adaptador
            Log.e("Adapter", view.findViewById<RecyclerView>(R.id.recViewPreguntas).adapter.toString())

        })

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.e("Adapter Created", this.tag.toString())

        view.findViewById<Button>(R.id.btnRegresarCategorias).setOnClickListener {
            activity?.supportFragmentManager?.beginTransaction()?.setCustomAnimations(
                R.anim.slide_in,
                R.anim.slide_out
            )?.replace(R.id.linearLayoutForFragment, CategoriasFragment.newInstance(), "Fragmento")?.commit()
        }
    }
}
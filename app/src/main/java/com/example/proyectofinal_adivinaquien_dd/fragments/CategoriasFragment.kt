package com.example.proyectofinal_adivinaquien_dd.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.proyectofinal_adivinaquien_dd.R
import com.example.proyectofinal_adivinaquien_dd.viewmodels.CategoriaViewModel
import com.google.android.material.button.MaterialButton

class CategoriasFragment : Fragment() {

    private val viewModel : CategoriaViewModel by activityViewModels()

    companion object {
        fun newInstance() : CategoriasFragment{
            return CategoriasFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_categorias, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.fragmentCerrar).setOnClickListener {
            activity?.supportFragmentManager?.beginTransaction()?.setCustomAnimations(
                R.anim.slide_in,
                R.anim.slide_out
            )?.remove(this)?.commit()
        }

        view.findViewById<MaterialButton>(R.id.btnSombrero).setOnClickListener {

            viewModel.selectBoton(it.findViewById(R.id.btnSombrero))

            val transaction = activity?.supportFragmentManager?.beginTransaction()
            transaction?.setCustomAnimations(
                R.anim.slide_in,
                R.anim.slide_out
            )
            transaction?.replace(R.id.linearLayoutForFragment, PreguntasFragment.newInstance(), "Preguntas")
            transaction?.commit()
        }

        view.findViewById<MaterialButton>(R.id.btnSexo).setOnClickListener {

            viewModel.selectBoton(it.findViewById(R.id.btnSexo))

            val transaction = activity?.supportFragmentManager?.beginTransaction()
            transaction?.setCustomAnimations(
                R.anim.slide_in,
                R.anim.slide_out
            )
            transaction?.replace(R.id.linearLayoutForFragment, PreguntasFragment.newInstance(), "Preguntas")
            transaction?.commit()
        }

        view.findViewById<MaterialButton>(R.id.btnPiel).setOnClickListener {

            viewModel.selectBoton(it.findViewById(R.id.btnPiel))

            val transaction = activity?.supportFragmentManager?.beginTransaction()
            transaction?.setCustomAnimations(
                R.anim.slide_in,
                R.anim.slide_out
            )
            transaction?.replace(R.id.linearLayoutForFragment, PreguntasFragment.newInstance(), "Preguntas")
            transaction?.commit()
        }

        view.findViewById<MaterialButton>(R.id.btnTatuaje).setOnClickListener {

            viewModel.selectBoton(it.findViewById(R.id.btnTatuaje))

            val transaction = activity?.supportFragmentManager?.beginTransaction()
            transaction?.setCustomAnimations(
                R.anim.slide_in,
                R.anim.slide_out
            )
            transaction?.replace(R.id.linearLayoutForFragment, PreguntasFragment.newInstance(), "Preguntas")
            transaction?.commit()
        }

        view.findViewById<MaterialButton>(R.id.btnAccesorio).setOnClickListener {

            viewModel.selectBoton(it.findViewById(R.id.btnAccesorio))

            val transaction = activity?.supportFragmentManager?.beginTransaction()
            transaction?.setCustomAnimations(
                R.anim.slide_in,
                R.anim.slide_out
            )
            transaction?.replace(R.id.linearLayoutForFragment, PreguntasFragment.newInstance(), "Preguntas")
            transaction?.commit()
        }

        view.findViewById<MaterialButton>(R.id.btnCabello).setOnClickListener {

            viewModel.selectBoton(it.findViewById(R.id.btnCabello))

            val transaction = activity?.supportFragmentManager?.beginTransaction()
            transaction?.setCustomAnimations(
                R.anim.slide_in,
                R.anim.slide_out
            )
            transaction?.replace(R.id.linearLayoutForFragment, PreguntasFragment.newInstance(), "Preguntas")
            transaction?.commit()
        }

        view.findViewById<MaterialButton>(R.id.btnLentes).setOnClickListener {

            viewModel.selectBoton(it.findViewById(R.id.btnLentes))

            val transaction = activity?.supportFragmentManager?.beginTransaction()
            transaction?.setCustomAnimations(
                R.anim.slide_in,
                R.anim.slide_out
            )
            transaction?.replace(R.id.linearLayoutForFragment, PreguntasFragment.newInstance(), "Preguntas")
            transaction?.commit()
        }

        view.findViewById<MaterialButton>(R.id.btnMascara).setOnClickListener {

            viewModel.selectBoton(it.findViewById(R.id.btnMascara))

            val transaction = activity?.supportFragmentManager?.beginTransaction()
            transaction?.setCustomAnimations(
                R.anim.slide_in,
                R.anim.slide_out
            )
            transaction?.replace(R.id.linearLayoutForFragment, PreguntasFragment.newInstance(), "Preguntas")
            transaction?.commit()
        }

    }
}
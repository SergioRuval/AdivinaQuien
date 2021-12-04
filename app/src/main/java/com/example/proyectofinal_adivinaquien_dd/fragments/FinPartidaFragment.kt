package com.example.proyectofinal_adivinaquien_dd.fragments

import android.app.Activity
import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.Window
import android.widget.Button
import android.widget.TextView
import com.example.proyectofinal_adivinaquien_dd.MenuPrincipal
import com.example.proyectofinal_adivinaquien_dd.R
import com.example.proyectofinal_adivinaquien_dd.UnJugadorActivity

class FinPartidaFragment (context: Context, message: String, puntos : Int, movimientos : Int) : Dialog(context) {
    private val message = message
    private val puntos = puntos
    private val movimientos = movimientos
    private lateinit var btnSalir : Button
    private lateinit var btnDeNuevo : Button

    init {
        setCancelable(false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.layout_fin_partida)
        findViewById<TextView>(R.id.txtResultado).text =  message
        findViewById<TextView>(R.id.txtFinalScore).text = "Puntuación: ${puntos} | Movimientos: ${movimientos}"

        btnSalir = findViewById(R.id.btnSalirDialog)
        btnDeNuevo = findViewById(R.id.btnVolverJugar)

        btnSalir.setOnClickListener {
            val intent = Intent(context, MenuPrincipal::class.java)
            context.startActivity(intent)
            val actvty = context as Activity
            actvty.finish()
        }

        btnDeNuevo.setOnClickListener {
            val intent = Intent(context, UnJugadorActivity::class.java)
            context.startActivity(intent)
            val actvty = context as Activity
            actvty.finish()
        }
    }
}
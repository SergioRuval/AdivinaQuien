package com.example.proyectofinal_adivinaquien_dd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button

class MenuPrincipal : AppCompatActivity() {

    private lateinit var btnUnJugador : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu_principal_activity)

        // Fijamos la orientación de la pantalla en modo horizontal y fullscreen
        this.window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)

        btnUnJugador = findViewById(R.id.btnUnJugador)

        btnUnJugador.setOnClickListener {
            val intent = Intent(this, UnJugadorActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}
package com.example.proyectofinal_adivinaquien_dd.viewmodels

import android.widget.Button
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CategoriaViewModel : ViewModel() {
    val botonesCategoria = MutableLiveData<Button>()

    fun selectBoton(boton : Button){
        botonesCategoria.value = boton
    }
}
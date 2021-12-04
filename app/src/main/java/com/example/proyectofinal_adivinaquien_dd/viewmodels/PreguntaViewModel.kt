package com.example.proyectofinal_adivinaquien_dd.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.proyectofinal_adivinaquien_dd.objects.Caracteristica

class PreguntaViewModel : ViewModel() {
    val preguntaSelected = MutableLiveData<Caracteristica>()

    fun selectPregunta(caracteristica : Caracteristica) {
        preguntaSelected.value = caracteristica
    }
}
package com.example.proyectofinal_adivinaquien_dd.tools

import android.content.Context
import android.content.res.Resources
import com.example.proyectofinal_adivinaquien_dd.R
import com.example.proyectofinal_adivinaquien_dd.data.Constantes
import com.example.proyectofinal_adivinaquien_dd.objects.Caracteristica

class HerramientaCaracteristica (context: Context) {
    val resources : Resources = context.resources

    fun getCaracteristicaFromPregunta(pregunta : String) : Caracteristica{
        val categorias = resources.getStringArray(R.array.categorias)
        var categoria = ""

        categorias.forEach {
            if(it in pregunta){
                categoria = it
            }
        }

        var color = ""
        var colores : Array<String>

        when(categoria){
            "cabello" -> colores = Constantes.COLORES_CABELLO
            "sombrero" -> colores = Constantes.COLORES_SOMBRERO
            "accesorio" -> colores = Constantes.COLORES_ACCESORIO
            "máscara" -> colores = Constantes.COLORES_MASCARA
            "anteojos" -> colores = Constantes.COLORES_ANTEOJOS
            "tatuajes" -> colores = Constantes.COLORES_TATUAJES
            "piel" -> colores = Constantes.COLORES_PIEL
            "sexo" -> colores = Constantes.SEXOS
            else -> colores = arrayOf("nada")
        }

        colores.forEach {
            if(it.equals("F") && "femenino" in pregunta){
                color = it
            }else if(it.equals("M") && "masculino" in pregunta){
                color = it
            }else if(it.lowercase() in pregunta && !categoria.equals("sexo")){
                color = it
            }
        }

        return Caracteristica(categoria, color, true)
    }
}
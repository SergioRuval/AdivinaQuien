package com.example.proyectofinal_adivinaquien_dd.objects

class Atributos(sombrero : Caracteristica, accesorio : Caracteristica,
                cabello : Caracteristica, mascara : Caracteristica, anteojos : Caracteristica,
                tatuajes : Caracteristica, sexo : String, piel : String) {

    private var sombrero : Caracteristica = sombrero
    private var accesorio : Caracteristica = accesorio
    private var cabello : Caracteristica = cabello
    private var mascara : Caracteristica = mascara
    private var anteojos : Caracteristica = anteojos
    private var tatuajes : Caracteristica = tatuajes
    private var sexo : String = sexo
    private var piel : String = piel

    fun isCaracteristica(caracteristica: Caracteristica) : Boolean{
        when(caracteristica.caracteristica){
            "cabello" -> {
                if (caracteristica.color.isEmpty()){
                    return this.cabello.existe
                }else if(this.cabello.existe){
                    return caracteristica.color.equals(this.cabello.color)
                }else{
                    return false
                }
            }
            "sombrero" -> {
                if (caracteristica.color.isEmpty()){
                    return this.sombrero.existe
                }else if(this.sombrero.existe){
                    return caracteristica.color.equals(this.sombrero.color)
                }else{
                    return false
                }
            }
            "accesorio" -> {
                if (caracteristica.color.isEmpty()){
                    return this.accesorio.existe
                }else if(this.accesorio.existe){
                    return caracteristica.color.equals(this.accesorio.color)
                }else{
                    return false
                }
            }
            "máscara" -> {
                if (caracteristica.color.isEmpty()){
                    return this.mascara.existe
                }else if(this.mascara.existe){
                    return caracteristica.color.equals(this.mascara.color)
                }else{
                    return false
                }
            }
            "anteojos" -> {
                if (caracteristica.color.isEmpty()){
                    return this.anteojos.existe
                }else if(this.anteojos.existe){
                    return caracteristica.color.equals(this.anteojos.color)
                }else{
                    return false
                }
            }
            "tatuajes" -> {
                if (caracteristica.color.isEmpty()){
                    return this.tatuajes.existe
                }else if(this.tatuajes.existe){
                    return caracteristica.color.equals(this.tatuajes.color)
                }else{
                    return false
                }
            }
            "piel" -> {
                return caracteristica.color.equals(this.piel)
            }
            "sexo" -> {
                return caracteristica.color.equals(this.sexo)
            }
            else -> return false
        }
    }
}
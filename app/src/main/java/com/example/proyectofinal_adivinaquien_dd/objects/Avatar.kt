package com.example.proyectofinal_adivinaquien_dd.objects

class Avatar {
    private var nombre : String
    private var atributos : Atributos
    private var imgSource : Int

    constructor(nombre : String, atributos : Atributos, imgSource : Int){
        this.nombre = nombre
        this.atributos  = atributos
        this.imgSource = imgSource
    }

    fun getImgSource() = imgSource

    fun getAtributos() = atributos
}
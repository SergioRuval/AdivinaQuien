package com.example.proyectofinal_adivinaquien_dd.objects

class Caracteristica(caracteristica: String, color : String, existe : Boolean) {
    var caracteristica : String = caracteristica
    var color: String = color
    var existe : Boolean = existe

    override fun toString(): String {
        return "Car : ${caracteristica}, col: ${color}, ex: ${existe}"
    }
}
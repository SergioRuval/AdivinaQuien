package com.example.proyectofinal_adivinaquien_dd.sqlite

import android.provider.BaseColumns

object SQLiteContract {
    const val SQL_CREATE_TABLA_PUNTUACION =
        "CREATE TABLE ${TablaScore.NAME} (" +
                "${BaseColumns._ID} INTEGER PRIMARY KEY, " +
                "${TablaScore.Score} INTEGER, " +
                "${TablaScore.Movimientos} INTEGER)"

    const val SQL_DROP_TABLA_PUNTUACION =
        "DROP TABLE IF EXISTS ${TablaScore.NAME}"

    object TablaScore : BaseColumns {
        const val NAME = "Puntuaciones"
        const val Score = "puntos"
        const val Movimientos = "movimientos"
    }
}
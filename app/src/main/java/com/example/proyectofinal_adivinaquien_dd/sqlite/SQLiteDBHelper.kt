package com.example.proyectofinal_adivinaquien_dd.sqlite

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.example.proyectofinal_adivinaquien_dd.sqlite.SQLiteContract.SQL_CREATE_TABLA_PUNTUACION
import com.example.proyectofinal_adivinaquien_dd.sqlite.SQLiteContract.SQL_DROP_TABLA_PUNTUACION

class SQLiteDBHelper (context: Context)
    : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL(SQL_CREATE_TABLA_PUNTUACION)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL(SQL_DROP_TABLA_PUNTUACION)
        onCreate(db)
    }

    companion object {
        // Si cambiamos el esquema de la base de datos hay que incrementar el número de versión de
        // este objeto
        const val DATABASE_VERSION = 1
        const val DATABASE_NAME = "SQLiteAdivinaQuien.db"
    }
}
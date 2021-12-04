package com.example.proyectofinal_adivinaquien_dd.data

import com.example.proyectofinal_adivinaquien_dd.R
import com.example.proyectofinal_adivinaquien_dd.data.Constantes.COLORES_ACCESORIO
import com.example.proyectofinal_adivinaquien_dd.data.Constantes.COLORES_ANTEOJOS
import com.example.proyectofinal_adivinaquien_dd.data.Constantes.COLORES_CABELLO
import com.example.proyectofinal_adivinaquien_dd.data.Constantes.COLORES_MASCARA
import com.example.proyectofinal_adivinaquien_dd.data.Constantes.COLORES_PIEL
import com.example.proyectofinal_adivinaquien_dd.data.Constantes.COLORES_SOMBRERO
import com.example.proyectofinal_adivinaquien_dd.data.Constantes.COLORES_TATUAJES
import com.example.proyectofinal_adivinaquien_dd.data.Constantes.NOMBRE_CARACTERISTICAS
import com.example.proyectofinal_adivinaquien_dd.data.Constantes.SEXOS
import com.example.proyectofinal_adivinaquien_dd.objects.Atributos
import com.example.proyectofinal_adivinaquien_dd.objects.Avatar
import com.example.proyectofinal_adivinaquien_dd.objects.Caracteristica

object ListaAvatares {
    val avatar01 : Avatar = Avatar(
        "Malzahar",
        Atributos(
            Caracteristica(NOMBRE_CARACTERISTICAS.get(0), COLORES_SOMBRERO.get(0), true),       // Sombrero
            Caracteristica(NOMBRE_CARACTERISTICAS.get(1), COLORES_ACCESORIO.get(0), false),     // Accesorio
            Caracteristica(NOMBRE_CARACTERISTICAS.get(2), COLORES_CABELLO.get(0), false),       // Cabello
            Caracteristica(NOMBRE_CARACTERISTICAS.get(3), COLORES_MASCARA.get(0), false),       // Mascara
            Caracteristica(NOMBRE_CARACTERISTICAS.get(4), COLORES_ANTEOJOS.get(0), true),       // Anteojos
            Caracteristica(NOMBRE_CARACTERISTICAS.get(5), COLORES_TATUAJES.get(0), false),      // Tatuajes
            SEXOS.get(0),                                                                              // Sexo
            COLORES_PIEL.get(3)                                                                        // Color piel
        ),
        R.drawable.avatar01
    )
    val avatar02 : Avatar = Avatar(
        "Darius",
        Atributos(
            Caracteristica(NOMBRE_CARACTERISTICAS.get(0), COLORES_SOMBRERO.get(0), false),       // Sombrero
            Caracteristica(NOMBRE_CARACTERISTICAS.get(1), COLORES_ACCESORIO.get(0), false),     // Accesorio
            Caracteristica(NOMBRE_CARACTERISTICAS.get(2), COLORES_CABELLO.get(0), false),       // Cabello
            Caracteristica(NOMBRE_CARACTERISTICAS.get(3), COLORES_MASCARA.get(0), false),       // Mascara
            Caracteristica(NOMBRE_CARACTERISTICAS.get(4), COLORES_ANTEOJOS.get(0), false),       // Anteojos
            Caracteristica(NOMBRE_CARACTERISTICAS.get(5), COLORES_TATUAJES.get(0), true),      // Tatuajes
            SEXOS.get(1),                                                                           // Sexo
            COLORES_PIEL.get(1)                                                                        // Color piel
        ),
        R.drawable.avatar02
    )
    val avatar03 : Avatar = Avatar(
        "Kindred",
        Atributos(
            Caracteristica(NOMBRE_CARACTERISTICAS.get(0), COLORES_SOMBRERO.get(1), true),       // Sombrero
            Caracteristica(NOMBRE_CARACTERISTICAS.get(1), COLORES_ACCESORIO.get(0), true),     // Accesorio
            Caracteristica(NOMBRE_CARACTERISTICAS.get(2), COLORES_CABELLO.get(3), true),       // Cabello
            Caracteristica(NOMBRE_CARACTERISTICAS.get(3), COLORES_MASCARA.get(0), true),       // Mascara
            Caracteristica(NOMBRE_CARACTERISTICAS.get(4), COLORES_ANTEOJOS.get(0), false),       // Anteojos
            Caracteristica(NOMBRE_CARACTERISTICAS.get(5), COLORES_TATUAJES.get(0), false),      // Tatuajes
            SEXOS.get(0),                                                                           // Sexo
            COLORES_PIEL.get(0)                                                                        // Color piel
        ),
        R.drawable.avatar03
    )
    val avatar04 : Avatar = Avatar(
        "Rell",
        Atributos(
            Caracteristica(NOMBRE_CARACTERISTICAS.get(0), COLORES_SOMBRERO.get(0), false),       // Sombrero
            Caracteristica(NOMBRE_CARACTERISTICAS.get(1), COLORES_ACCESORIO.get(0), false),     // Accesorio
            Caracteristica(NOMBRE_CARACTERISTICAS.get(2), COLORES_CABELLO.get(0), true),       // Cabello
            Caracteristica(NOMBRE_CARACTERISTICAS.get(3), COLORES_MASCARA.get(1), true),       // Mascara
            Caracteristica(NOMBRE_CARACTERISTICAS.get(4), COLORES_ANTEOJOS.get(0), false),       // Anteojos
            Caracteristica(NOMBRE_CARACTERISTICAS.get(5), COLORES_TATUAJES.get(1), true),      // Tatuajes
            SEXOS.get(0),                                                                           // Sexo
            COLORES_PIEL.get(1)                                                                        // Color piel
        ),
        R.drawable.avatar04
    )
    val avatar05 : Avatar = Avatar(
        "Jinx",
        Atributos(
            Caracteristica(NOMBRE_CARACTERISTICAS.get(0), COLORES_SOMBRERO.get(0), false),       // Sombrero
            Caracteristica(NOMBRE_CARACTERISTICAS.get(1), COLORES_ACCESORIO.get(0), false),     // Accesorio
            Caracteristica(NOMBRE_CARACTERISTICAS.get(2), COLORES_CABELLO.get(1), true),       // Cabello
            Caracteristica(NOMBRE_CARACTERISTICAS.get(3), COLORES_MASCARA.get(2), true),       // Mascara
            Caracteristica(NOMBRE_CARACTERISTICAS.get(4), COLORES_ANTEOJOS.get(0), false),       // Anteojos
            Caracteristica(NOMBRE_CARACTERISTICAS.get(5), COLORES_TATUAJES.get(0), false),      // Tatuajes
            SEXOS.get(0),                                                                           // Sexo
            COLORES_PIEL.get(0)                                                                        // Color piel
        ),
        R.drawable.avatar05
    )
    val avatar06 : Avatar = Avatar(
        "Gangplank",
        Atributos(
            Caracteristica(NOMBRE_CARACTERISTICAS.get(0), COLORES_SOMBRERO.get(2), true),       // Sombrero
            Caracteristica(NOMBRE_CARACTERISTICAS.get(1), COLORES_ACCESORIO.get(0), false),     // Accesorio
            Caracteristica(NOMBRE_CARACTERISTICAS.get(2), COLORES_CABELLO.get(0), false),       // Cabello
            Caracteristica(NOMBRE_CARACTERISTICAS.get(3), COLORES_MASCARA.get(0), false),       // Mascara
            Caracteristica(NOMBRE_CARACTERISTICAS.get(4), COLORES_ANTEOJOS.get(0), true),       // Anteojos
            Caracteristica(NOMBRE_CARACTERISTICAS.get(5), COLORES_TATUAJES.get(2), true),      // Tatuajes
            SEXOS.get(1),                                                                           // Sexo
            COLORES_PIEL.get(1)                                                                        // Color piel
        ),
        R.drawable.avatar06
    )
    val avatar07 : Avatar = Avatar(
        "Janna",
        Atributos(
            Caracteristica(NOMBRE_CARACTERISTICAS.get(0), COLORES_SOMBRERO.get(2), false),       // Sombrero
            Caracteristica(NOMBRE_CARACTERISTICAS.get(1), COLORES_ACCESORIO.get(0), false),     // Accesorio
            Caracteristica(NOMBRE_CARACTERISTICAS.get(2), COLORES_CABELLO.get(4), true),       // Cabello
            Caracteristica(NOMBRE_CARACTERISTICAS.get(3), COLORES_MASCARA.get(0), false),       // Mascara
            Caracteristica(NOMBRE_CARACTERISTICAS.get(4), COLORES_ANTEOJOS.get(0), false),       // Anteojos
            Caracteristica(NOMBRE_CARACTERISTICAS.get(5), COLORES_TATUAJES.get(2), false),      // Tatuajes
            SEXOS.get(0),                                                                           // Sexo
            COLORES_PIEL.get(0)                                                                        // Color piel
        ),
        R.drawable.avatar07
    )
    val avatar08 : Avatar = Avatar(
        "Braum",
        Atributos(
            Caracteristica(NOMBRE_CARACTERISTICAS.get(0), COLORES_SOMBRERO.get(2), false),       // Sombrero
            Caracteristica(NOMBRE_CARACTERISTICAS.get(1), COLORES_ACCESORIO.get(1), true),     // Accesorio
            Caracteristica(NOMBRE_CARACTERISTICAS.get(2), COLORES_CABELLO.get(4), false),       // Cabello
            Caracteristica(NOMBRE_CARACTERISTICAS.get(3), COLORES_MASCARA.get(0), false),       // Mascara
            Caracteristica(NOMBRE_CARACTERISTICAS.get(4), COLORES_ANTEOJOS.get(0), false),       // Anteojos
            Caracteristica(NOMBRE_CARACTERISTICAS.get(5), COLORES_TATUAJES.get(3), true),      // Tatuajes
            SEXOS.get(1),                                                                           // Sexo
            COLORES_PIEL.get(0)                                                                        // Color piel
        ),
        R.drawable.avatar08
    )
    val avatar09 : Avatar = Avatar(
        "Viktor",
        Atributos(
            Caracteristica(NOMBRE_CARACTERISTICAS.get(0), COLORES_SOMBRERO.get(2), false),       // Sombrero
            Caracteristica(NOMBRE_CARACTERISTICAS.get(1), COLORES_ACCESORIO.get(1), false),     // Accesorio
            Caracteristica(NOMBRE_CARACTERISTICAS.get(2), COLORES_CABELLO.get(0), true),       // Cabello
            Caracteristica(NOMBRE_CARACTERISTICAS.get(3), COLORES_MASCARA.get(0), false),       // Mascara
            Caracteristica(NOMBRE_CARACTERISTICAS.get(4), COLORES_ANTEOJOS.get(1), true),       // Anteojos
            Caracteristica(NOMBRE_CARACTERISTICAS.get(5), COLORES_TATUAJES.get(1), true),      // Tatuajes
            SEXOS.get(1),                                                                           // Sexo
            COLORES_PIEL.get(0)                                                                        // Color piel
        ),
        R.drawable.avatar09
    )
    val avatar10 : Avatar = Avatar(
        "Senna",
        Atributos(
            Caracteristica(NOMBRE_CARACTERISTICAS.get(0), COLORES_SOMBRERO.get(2), false),       // Sombrero
            Caracteristica(NOMBRE_CARACTERISTICAS.get(1), COLORES_ACCESORIO.get(0), true),     // Accesorio
            Caracteristica(NOMBRE_CARACTERISTICAS.get(2), COLORES_CABELLO.get(0), true),       // Cabello
            Caracteristica(NOMBRE_CARACTERISTICAS.get(3), COLORES_MASCARA.get(0), false),       // Mascara
            Caracteristica(NOMBRE_CARACTERISTICAS.get(4), COLORES_ANTEOJOS.get(1), false),       // Anteojos
            Caracteristica(NOMBRE_CARACTERISTICAS.get(5), COLORES_TATUAJES.get(1), false),      // Tatuajes
            SEXOS.get(0),                                                                           // Sexo
            COLORES_PIEL.get(1)                                                                        // Color piel
        ),
        R.drawable.avatar10
    )
    val avatar11 : Avatar = Avatar(
        "Lucian",
        Atributos(
            Caracteristica(NOMBRE_CARACTERISTICAS.get(0), COLORES_SOMBRERO.get(3), true),       // Sombrero
            Caracteristica(NOMBRE_CARACTERISTICAS.get(1), COLORES_ACCESORIO.get(0), false),     // Accesorio
            Caracteristica(NOMBRE_CARACTERISTICAS.get(2), COLORES_CABELLO.get(4), true),       // Cabello
            Caracteristica(NOMBRE_CARACTERISTICAS.get(3), COLORES_MASCARA.get(0), false),       // Mascara
            Caracteristica(NOMBRE_CARACTERISTICAS.get(4), COLORES_ANTEOJOS.get(2), true),       // Anteojos
            Caracteristica(NOMBRE_CARACTERISTICAS.get(5), COLORES_TATUAJES.get(1), true),      // Tatuajes
            SEXOS.get(1),                                                                           // Sexo
            COLORES_PIEL.get(1)                                                                        // Color piel
        ),
        R.drawable.avatar11
    )
    val avatar12 : Avatar = Avatar(
        "Kayle",
        Atributos(
            Caracteristica(NOMBRE_CARACTERISTICAS.get(0), COLORES_SOMBRERO.get(2), true),       // Sombrero
            Caracteristica(NOMBRE_CARACTERISTICAS.get(1), COLORES_ACCESORIO.get(0), false),     // Accesorio
            Caracteristica(NOMBRE_CARACTERISTICAS.get(2), COLORES_CABELLO.get(4), false),       // Cabello
            Caracteristica(NOMBRE_CARACTERISTICAS.get(3), COLORES_MASCARA.get(1), true),       // Mascara
            Caracteristica(NOMBRE_CARACTERISTICAS.get(4), COLORES_ANTEOJOS.get(2), false),       // Anteojos
            Caracteristica(NOMBRE_CARACTERISTICAS.get(5), COLORES_TATUAJES.get(1), false),      // Tatuajes
            SEXOS.get(1),                                                                           // Sexo
            COLORES_PIEL.get(0)                                                                        // Color piel
        ),
        R.drawable.avatar12
    )
    val avatar13 : Avatar = Avatar(
        "Ekko",
        Atributos(
            Caracteristica(NOMBRE_CARACTERISTICAS.get(0), COLORES_SOMBRERO.get(2), false),       // Sombrero
            Caracteristica(NOMBRE_CARACTERISTICAS.get(1), COLORES_ACCESORIO.get(0), false),     // Accesorio
            Caracteristica(NOMBRE_CARACTERISTICAS.get(2), COLORES_CABELLO.get(4), false),       // Cabello
            Caracteristica(NOMBRE_CARACTERISTICAS.get(3), COLORES_MASCARA.get(2), true),       // Mascara
            Caracteristica(NOMBRE_CARACTERISTICAS.get(4), COLORES_ANTEOJOS.get(2), false),       // Anteojos
            Caracteristica(NOMBRE_CARACTERISTICAS.get(5), COLORES_TATUAJES.get(1), false),      // Tatuajes
            SEXOS.get(1),                                                                           // Sexo
            COLORES_PIEL.get(1)                                                                        // Color piel
        ),
        R.drawable.avatar13
    )
    val avatar14 : Avatar = Avatar(
        "Vi",
        Atributos(
            Caracteristica(NOMBRE_CARACTERISTICAS.get(0), COLORES_SOMBRERO.get(2), false),       // Sombrero
            Caracteristica(NOMBRE_CARACTERISTICAS.get(1), COLORES_ACCESORIO.get(0), false),     // Accesorio
            Caracteristica(NOMBRE_CARACTERISTICAS.get(2), COLORES_CABELLO.get(4), true),       // Cabello
            Caracteristica(NOMBRE_CARACTERISTICAS.get(3), COLORES_MASCARA.get(2), false),       // Mascara
            Caracteristica(NOMBRE_CARACTERISTICAS.get(4), COLORES_ANTEOJOS.get(3), true),       // Anteojos
            Caracteristica(NOMBRE_CARACTERISTICAS.get(5), COLORES_TATUAJES.get(1), true),      // Tatuajes
            SEXOS.get(0),                                                                           // Sexo
            COLORES_PIEL.get(0)                                                                        // Color piel
        ),
        R.drawable.avatar14
    )
    val avatar15 : Avatar = Avatar(
        "Viego",
        Atributos(
            Caracteristica(NOMBRE_CARACTERISTICAS.get(0), COLORES_SOMBRERO.get(1), true),       // Sombrero
            Caracteristica(NOMBRE_CARACTERISTICAS.get(1), COLORES_ACCESORIO.get(0), true),     // Accesorio
            Caracteristica(NOMBRE_CARACTERISTICAS.get(2), COLORES_CABELLO.get(4), false),       // Cabello
            Caracteristica(NOMBRE_CARACTERISTICAS.get(3), COLORES_MASCARA.get(2), false),       // Mascara
            Caracteristica(NOMBRE_CARACTERISTICAS.get(4), COLORES_ANTEOJOS.get(3), false),       // Anteojos
            Caracteristica(NOMBRE_CARACTERISTICAS.get(5), COLORES_TATUAJES.get(3), true),      // Tatuajes
            SEXOS.get(1),                                                                           // Sexo
            COLORES_PIEL.get(3)                                                                        // Color piel
        ),
        R.drawable.avatar15
    )
    val avatar16 : Avatar = Avatar(
        "Twitch",
        Atributos(
            Caracteristica(NOMBRE_CARACTERISTICAS.get(0), COLORES_SOMBRERO.get(1), false),       // Sombrero
            Caracteristica(NOMBRE_CARACTERISTICAS.get(1), COLORES_ACCESORIO.get(0), false),     // Accesorio
            Caracteristica(NOMBRE_CARACTERISTICAS.get(2), COLORES_CABELLO.get(2), true),       // Cabello
            Caracteristica(NOMBRE_CARACTERISTICAS.get(3), COLORES_MASCARA.get(2), false),       // Mascara
            Caracteristica(NOMBRE_CARACTERISTICAS.get(4), COLORES_ANTEOJOS.get(4), true),       // Anteojos
            Caracteristica(NOMBRE_CARACTERISTICAS.get(5), COLORES_TATUAJES.get(3), false),      // Tatuajes
            SEXOS.get(1),                                                                           // Sexo
            COLORES_PIEL.get(0)                                                                        // Color piel
        ),
        R.drawable.avatar16
    )
    val avatar17 : Avatar = Avatar(
        "Lissandra",
        Atributos(
            Caracteristica(NOMBRE_CARACTERISTICAS.get(0), COLORES_SOMBRERO.get(1), false),       // Sombrero
            Caracteristica(NOMBRE_CARACTERISTICAS.get(1), COLORES_ACCESORIO.get(0), false),     // Accesorio
            Caracteristica(NOMBRE_CARACTERISTICAS.get(2), COLORES_CABELLO.get(2), true),       // Cabello
            Caracteristica(NOMBRE_CARACTERISTICAS.get(3), COLORES_MASCARA.get(2), false),       // Mascara
            Caracteristica(NOMBRE_CARACTERISTICAS.get(4), COLORES_ANTEOJOS.get(5), true),       // Anteojos
            Caracteristica(NOMBRE_CARACTERISTICAS.get(5), COLORES_TATUAJES.get(3), false),      // Tatuajes
            SEXOS.get(0),                                                                           // Sexo
            COLORES_PIEL.get(2)                                                                        // Color piel
        ),
        R.drawable.avatar17
    )
    val avatar18 : Avatar = Avatar(
        "Caytlin",
        Atributos(
            Caracteristica(NOMBRE_CARACTERISTICAS.get(0), COLORES_SOMBRERO.get(4), true),       // Sombrero
            Caracteristica(NOMBRE_CARACTERISTICAS.get(1), COLORES_ACCESORIO.get(2), true),     // Accesorio
            Caracteristica(NOMBRE_CARACTERISTICAS.get(2), COLORES_CABELLO.get(3), true),       // Cabello
            Caracteristica(NOMBRE_CARACTERISTICAS.get(3), COLORES_MASCARA.get(2), false),       // Mascara
            Caracteristica(NOMBRE_CARACTERISTICAS.get(4), COLORES_ANTEOJOS.get(2), true),       // Anteojos
            Caracteristica(NOMBRE_CARACTERISTICAS.get(5), COLORES_TATUAJES.get(4), true),      // Tatuajes
            SEXOS.get(0),                                                                           // Sexo
            COLORES_PIEL.get(1)                                                                        // Color piel
        ),
        R.drawable.avatar18
    )
    val avatar19 : Avatar = Avatar(
        "Jayce",
        Atributos(
            Caracteristica(NOMBRE_CARACTERISTICAS.get(0), COLORES_SOMBRERO.get(3), true),       // Sombrero
            Caracteristica(NOMBRE_CARACTERISTICAS.get(1), COLORES_ACCESORIO.get(1), true),     // Accesorio
            Caracteristica(NOMBRE_CARACTERISTICAS.get(2), COLORES_CABELLO.get(2), true),       // Cabello
            Caracteristica(NOMBRE_CARACTERISTICAS.get(3), COLORES_MASCARA.get(2), false),       // Mascara
            Caracteristica(NOMBRE_CARACTERISTICAS.get(4), COLORES_ANTEOJOS.get(2), true),       // Anteojos
            Caracteristica(NOMBRE_CARACTERISTICAS.get(5), COLORES_TATUAJES.get(3), true),      // Tatuajes
            SEXOS.get(1) ,                                                                           // Sexo
            COLORES_PIEL.get(0)                                                                        // Color piel
        ),
        R.drawable.avatar19
    )
    val avatar20 : Avatar = Avatar(
        "Sona",
        Atributos(
            Caracteristica(NOMBRE_CARACTERISTICAS.get(0), COLORES_SOMBRERO.get(3), false),       // Sombrero
            Caracteristica(NOMBRE_CARACTERISTICAS.get(1), COLORES_ACCESORIO.get(1), false),     // Accesorio
            Caracteristica(NOMBRE_CARACTERISTICAS.get(2), COLORES_CABELLO.get(4), true),       // Cabello
            Caracteristica(NOMBRE_CARACTERISTICAS.get(3), COLORES_MASCARA.get(1), true),       // Mascara
            Caracteristica(NOMBRE_CARACTERISTICAS.get(4), COLORES_ANTEOJOS.get(2), false),       // Anteojos
            Caracteristica(NOMBRE_CARACTERISTICAS.get(5), COLORES_TATUAJES.get(2), true),      // Tatuajes
            SEXOS.get(0),                                                                           // Sexo
            COLORES_PIEL.get(1)                                                                        // Color piel
        ),
        R.drawable.avatar20
    )
    val avatar21 : Avatar = Avatar(
        "Poppy",
        Atributos(
            Caracteristica(NOMBRE_CARACTERISTICAS.get(0), COLORES_SOMBRERO.get(4), true),       // Sombrero
            Caracteristica(NOMBRE_CARACTERISTICAS.get(1), COLORES_ACCESORIO.get(1), true),     // Accesorio
            Caracteristica(NOMBRE_CARACTERISTICAS.get(2), COLORES_CABELLO.get(3), true),       // Cabello
            Caracteristica(NOMBRE_CARACTERISTICAS.get(3), COLORES_MASCARA.get(1), false),       // Mascara
            Caracteristica(NOMBRE_CARACTERISTICAS.get(4), COLORES_ANTEOJOS.get(5), true),       // Anteojos
            Caracteristica(NOMBRE_CARACTERISTICAS.get(5), COLORES_TATUAJES.get(1), true),      // Tatuajes
            SEXOS.get(0),                                                                           // Sexo
            COLORES_PIEL.get(1)                                                                        // Color piel
        ),
        R.drawable.avatar21
    )
    val avatar22 : Avatar = Avatar(
        "Urgot",
        Atributos(
            Caracteristica(NOMBRE_CARACTERISTICAS.get(0), COLORES_SOMBRERO.get(4), false),       // Sombrero
            Caracteristica(NOMBRE_CARACTERISTICAS.get(1), COLORES_ACCESORIO.get(1), false),     // Accesorio
            Caracteristica(NOMBRE_CARACTERISTICAS.get(2), COLORES_CABELLO.get(3), false),       // Cabello
            Caracteristica(NOMBRE_CARACTERISTICAS.get(3), COLORES_MASCARA.get(3), true),       // Mascara
            Caracteristica(NOMBRE_CARACTERISTICAS.get(4), COLORES_ANTEOJOS.get(5), false),       // Anteojos
            Caracteristica(NOMBRE_CARACTERISTICAS.get(5), COLORES_TATUAJES.get(1), false),      // Tatuajes
            SEXOS.get(0),                                                                           // Sexo
            COLORES_PIEL.get(0)                                                                        // Color piel
        ),
        R.drawable.avatar22
    )
    val avatar23 : Avatar = Avatar(
        "Jax",
        Atributos(
            Caracteristica(NOMBRE_CARACTERISTICAS.get(0), COLORES_SOMBRERO.get(4), false),       // Sombrero
            Caracteristica(NOMBRE_CARACTERISTICAS.get(1), COLORES_ACCESORIO.get(3), true),     // Accesorio
            Caracteristica(NOMBRE_CARACTERISTICAS.get(2), COLORES_CABELLO.get(3), false),       // Cabello
            Caracteristica(NOMBRE_CARACTERISTICAS.get(3), COLORES_MASCARA.get(3), false),       // Mascara
            Caracteristica(NOMBRE_CARACTERISTICAS.get(4), COLORES_ANTEOJOS.get(4), true),       // Anteojos
            Caracteristica(NOMBRE_CARACTERISTICAS.get(5), COLORES_TATUAJES.get(1), false),      // Tatuajes
            SEXOS.get(1),                                                                           // Sexo
            COLORES_PIEL.get(1)                                                                        // Color piel
        ),
        R.drawable.avatar23
    )
    val avatar24 : Avatar = Avatar(
        "Leona",
        Atributos(
            Caracteristica(NOMBRE_CARACTERISTICAS.get(0), COLORES_SOMBRERO.get(4), false),       // Sombrero
            Caracteristica(NOMBRE_CARACTERISTICAS.get(1), COLORES_ACCESORIO.get(0), true),     // Accesorio
            Caracteristica(NOMBRE_CARACTERISTICAS.get(2), COLORES_CABELLO.get(0), true),       // Cabello
            Caracteristica(NOMBRE_CARACTERISTICAS.get(3), COLORES_MASCARA.get(4), true),       // Mascara
            Caracteristica(NOMBRE_CARACTERISTICAS.get(4), COLORES_ANTEOJOS.get(4), false),       // Anteojos
            Caracteristica(NOMBRE_CARACTERISTICAS.get(5), COLORES_TATUAJES.get(1), false),      // Tatuajes
            SEXOS.get(0),                                                                           // Sexo
            COLORES_PIEL.get(0)                                                                        // Color piel
        ),
        R.drawable.avatar24
    )

    val arrayAvatares : List<Avatar> = listOf(avatar01, avatar02, avatar03, avatar04, avatar05, avatar06, avatar07, avatar08, avatar09, avatar10,
        avatar11, avatar12, avatar13, avatar14, avatar15, avatar16, avatar17, avatar18, avatar19, avatar20, avatar21, avatar22, avatar23, avatar24)
}
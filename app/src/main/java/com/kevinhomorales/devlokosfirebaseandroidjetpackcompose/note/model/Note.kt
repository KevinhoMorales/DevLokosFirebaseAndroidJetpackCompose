package com.kevinhomorales.devlokosfirebaseandroidjetpackcompose.note.model

data class Note(
    val id: String = "",         // 🔹 ID del documento
    val title: String = "",      // 🔹 Título de la nota
    val content: String = ""     // 🔹 Contenido de la nota
)
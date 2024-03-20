package com.example.notassqlite_233381.presentation

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import com.example.notassqlite_233381.data.Note

data class NoteState(

    val notes: List<Note> = emptyList(),
    val title: MutableState<String> = mutableStateOf(""),
    val description: MutableState<String> = mutableStateOf(""),
    var titleValidacion: Boolean = false,
    var descriptionValidacion: Boolean = false,

    )
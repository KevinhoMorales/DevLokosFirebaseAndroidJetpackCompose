package com.kevinhomorales.devlokosfirebaseandroidjetpackcompose.note.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kevinhomorales.devlokosfirebaseandroidjetpackcompose.note.model.Note
import com.kevinhomorales.devlokosfirebaseandroidjetpackcompose.note.repository.NoteRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class NoteViewModel : ViewModel() {

    private val repository = NoteRepository()

    private val _notes = MutableStateFlow<List<Note>>(emptyList())
    val notes: StateFlow<List<Note>> = _notes

    fun loadNotes() {
        viewModelScope.launch {
            val result = repository.getNotes()
            Log.d("NOTE_DEBUG", "Notas obtenidas: ${result.size}")
            _notes.value = result
        }
    }

    fun saveNote(title: String, content: String) {
        viewModelScope.launch {
            val note = Note(title = title, content = content)
            repository.addNote(note)
            loadNotes()
        }
    }
}
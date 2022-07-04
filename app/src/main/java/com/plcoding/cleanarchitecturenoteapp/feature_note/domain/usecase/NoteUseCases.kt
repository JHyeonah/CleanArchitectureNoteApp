package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.usecase

data class NoteUseCases(
    val getNote: GetNote,
    val deleteNote: DeleteNote,
    val addNote: AddNote
)
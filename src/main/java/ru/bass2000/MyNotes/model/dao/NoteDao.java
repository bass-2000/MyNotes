package ru.bass2000.MyNotes.model.dao;

import ru.bass2000.MyNotes.model.entity.Note;

public interface NoteDao {
    String getNoteDescription(Note note);
}

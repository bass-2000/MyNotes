package ru.bass2000.MyNotes.model.dao;

import org.springframework.stereotype.Repository;
import ru.bass2000.MyNotes.model.entity.Note;

@Repository
public class NoteDaoImpl implements NoteDao {

    public String getNoteDescription(Note note) {
        return note.getNote();
    }
}

package ru.bass2000.MyNotes.model.mapper;

import org.springframework.jdbc.core.RowMapper;
import ru.bass2000.MyNotes.model.entity.Note;

import java.sql.ResultSet;
import java.sql.SQLException;

public class NoteMapper implements RowMapper<Note> {
    @Override
    public Note mapRow(ResultSet rs, int rowNum) throws SQLException {
        Note note = new Note(rs.getInt("note_id"), rs.getString("note"), rs.getInt("user_id"));
        return note;
    }
}
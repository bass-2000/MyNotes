package ru.bass2000.MyNotes.model.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.bass2000.MyNotes.model.entity.Note;
import ru.bass2000.MyNotes.model.entity.User;
import ru.bass2000.MyNotes.model.mapper.NoteMapper;
import ru.bass2000.MyNotes.model.mapper.UserMapper;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public List<Note> getAllUserNotes(User user) {
        String getAllUserNotesQuery = "select * from note as n inner join user_note as un on n.note_id=un.note_id where user_id=?";
        return jdbcTemplate.query(getAllUserNotesQuery, new NoteMapper());
    }

    public User getUserByLogin(String login) {
        String getUserByLoginQuery = "select * from users where login=?";
        return jdbcTemplate.query(getUserByLoginQuery, new UserMapper()).get(0);
    }
}

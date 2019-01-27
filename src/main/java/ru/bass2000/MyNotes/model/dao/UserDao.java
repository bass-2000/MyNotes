package ru.bass2000.MyNotes.model.dao;

import ru.bass2000.MyNotes.model.entity.Note;
import ru.bass2000.MyNotes.model.entity.User;

import java.util.List;

public interface UserDao {
    List<Note> getAllUserNotes(User user);

    User getUserByLogin(String login);
}

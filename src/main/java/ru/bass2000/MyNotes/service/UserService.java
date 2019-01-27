package ru.bass2000.MyNotes.service;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import ru.bass2000.MyNotes.model.dao.NoteDao;
import ru.bass2000.MyNotes.model.dao.UserDao;
import ru.bass2000.MyNotes.model.entity.Note;
import ru.bass2000.MyNotes.model.entity.User;

import java.util.List;

@Service
public class UserService {
    private UserDao userDao;
    private NoteDao noteDao;

    public List<Note> getAllUserNotes(User user) {
        return userDao.getAllUserNotes(user);
    }

    public User getUserByLogin(String login) {
        return userDao.getUserByLogin(login);
    }

    public String getUserLogin() {
        String currentUserName = "";
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (!(authentication instanceof AnonymousAuthenticationToken)) {
            currentUserName = authentication.getName();
        }
        return currentUserName;
    }
}

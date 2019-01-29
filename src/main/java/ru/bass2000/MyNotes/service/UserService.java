package ru.bass2000.MyNotes.service;

import ru.bass2000.MyNotes.model.entity.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
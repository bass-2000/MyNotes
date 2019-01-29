package ru.bass2000.MyNotes.service;

public interface SecurityService {
    String findLoggedInUsername();

    void autologin(String username, String password);
}
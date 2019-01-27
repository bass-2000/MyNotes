package ru.bass2000.MyNotes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.bass2000.MyNotes.model.entity.Note;
import ru.bass2000.MyNotes.model.entity.User;
import ru.bass2000.MyNotes.service.NoteService;
import ru.bass2000.MyNotes.service.UserService;

import java.util.List;

@Controller
public class NoteController {
    private NoteService noteService;
    private UserService userService;

    @Autowired
    public void setNoteService(NoteService noteService) {
        this.noteService = noteService;
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String dashboard(Model model) {
        User user = userService.getUserByLogin(userService.getUserLogin());
        List<Note> listOfNotes = userService.getAllUserNotes(user);
        model.addAllAttributes(listOfNotes);
        return "dashboard";
    }
}

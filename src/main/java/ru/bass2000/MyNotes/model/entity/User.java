package ru.bass2000.MyNotes.model.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "User")
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;

    @Column
    private String login;

    @Column
    private String password;

    @Column
    private String email;

    @Column
    @OneToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "user_note",
            joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "note_id")}
    )
    private List<Note> notes_list = new ArrayList();

    public User(int user_id, String login, String password, String email) {
        this.login = login;
        this.password = password;
        this.email = email;
    }
}

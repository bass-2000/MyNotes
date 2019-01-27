package ru.bass2000.MyNotes.repository;

import javax.persistence.*;

@Entity
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String note;

    @Column
    private long user_id;

    @Column
    private long shared_to_user_ids;
}

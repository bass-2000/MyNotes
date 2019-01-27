package ru.bass2000.MyNotes.model.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int note_id;

    @Column
    private String note;
    @Column
    private int owner_id;
    @Column
    @ManyToMany(mappedBy = "notes_list")
    private List<User> shared_to_user_ids = new ArrayList<>();

    public Note(int note_id, String note, int owner_id) {
        this.note_id = note_id;
        this.note = note;
        this.owner_id = owner_id;
    }

    public int getNote_id() {
        return note_id;
    }

    public void setNote_id(int note_id) {
        this.note_id = note_id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(int owner_id) {
        this.owner_id = owner_id;
    }

    public List<User> getShared_to_user_ids() {
        return shared_to_user_ids;
    }

    public void setShared_to_user_ids(List<User> shared_to_user_ids) {
        this.shared_to_user_ids = shared_to_user_ids;
    }
}

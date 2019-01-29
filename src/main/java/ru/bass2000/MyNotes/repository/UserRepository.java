package ru.bass2000.MyNotes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.bass2000.MyNotes.model.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
package ru.bass2000.MyNotes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.bass2000.MyNotes.model.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
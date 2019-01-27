package ru.bass2000.MyNotes.model.mapper;

import org.springframework.jdbc.core.RowMapper;
import ru.bass2000.MyNotes.model.entity.User;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User user = new User(rs.getInt("user_id"), rs.getString("email"), rs.getString("login"), rs.getString("password"));
        return user;
    }
}

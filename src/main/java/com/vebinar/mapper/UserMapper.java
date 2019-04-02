package com.vebinar.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.vebinar.entity.User;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;

public class UserMapper implements RowMapper<User> {

//    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {  // manually mapping our user from data base
        User user = new User();
        user.setId(resultSet.getInt("id"));
        user.setName(resultSet.getString("name"));
        user.setEmail(resultSet.getString("email"));
        user.setAge(resultSet.getInt("age"));
        return user;
    }
}

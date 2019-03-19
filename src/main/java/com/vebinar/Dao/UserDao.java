package com.vebinar.Dao;

import java.util.List;

import com.vebinar.entity.User;

public interface UserDao {

    void save(User user);

    User getById(int id);

    List<User> findAll();

    void update(User user);

    void delete(int id);

}

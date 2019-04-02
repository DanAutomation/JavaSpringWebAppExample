package com.vebinar.service;

import java.util.List;

import com.vebinar.entity.User;

public interface UserService {  // describe all logic from controller and dao

    void save(User user) throws Exception;

    User getById(int id);

    List<User> findAll();

    void update(User user);

    void delete(int id);
    
}

package com.saber.dao;

import com.saber.model.User;

import java.util.List;

public interface UserDao {

    User findUserById(Integer id);
    List<User> findAll();
    boolean deleteUser(Integer id);
    Integer updateUser(User user);
    void saveUser(User user);
}

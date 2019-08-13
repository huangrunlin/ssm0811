package com.saber.service.impl;

import com.saber.dao.UserDao;
import com.saber.model.User;
import com.saber.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public User findUserById(Integer id){
        return userDao.findUserById(id);
    }

    public List<User> findAll(){
        return userDao.findAll();
    }

    public boolean deleteUser(Integer id){
        return userDao.deleteUser(id);
    }

    public Integer updateUser(User user){
        return userDao.updateUser(user);
    }

    public void saveUser(User user){
         userDao.saveUser(user);
    }
}

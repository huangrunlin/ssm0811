package com.saber.dao;

import com.saber.model.User;
import com.saber.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class UserDaoTest {

    @Autowired
    private UserService userService;

    @Test
    public void testUser(){
        User user =userService.findUserById(1);
        System.out.println(user);
    }

}
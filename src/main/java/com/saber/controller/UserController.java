package com.saber.controller;

import com.saber.model.User;
import com.saber.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("toAddUser")
    public String toAddUser(){
        return "addUser";
    }

    @RequestMapping("addUser")
    public String addUser(Model model, User user){
        if(user!=null){
            userService.saveUser(user);
        }
        return "redirect:/user/getAllUser";
    }

    @RequestMapping("getAllUser")
    public String getAllUser(Model model){
        List<User> user =userService.findAll();
        model.addAttribute("userList",user);
        return "allUser";
    }

    @RequestMapping("delUser")
    public String removeUser(Model model,Integer id){
        model.addAttribute("user",userService.deleteUser(id));

        return "redirect:/user/getAllUser";
    }

    @RequestMapping("toUpdate")
    public String toUpdate(@RequestParam(value="id")Integer id,Model model){
        model.addAttribute("user",userService.findUserById(id));
        return "updateUser";
    }

    @RequestMapping(value="updateUser",method= RequestMethod.POST)
    public String updateUser(User user){
        userService.updateUser(user);
        return "redirect:/user/getAllUser";
    }
}

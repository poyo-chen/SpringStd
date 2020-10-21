package com.spring.ioc.userMod.controller;

import com.spring.ioc.userMod.service.UserService;
import com.spring.ioc.userMod.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    public  void addUser(){
        userService.addUser();
    }

    public UserController() {
        System.out.println("UserController");
    }
}

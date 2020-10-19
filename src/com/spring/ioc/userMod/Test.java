package com.spring.ioc.userMod;

import com.spring.ioc.userMod.controller.UserController;
import com.spring.ioc.userMod.dao.UserDao;
import com.spring.ioc.userMod.dao.UserDaoImpl;
import com.spring.ioc.userMod.service.UserService;
import com.spring.ioc.userMod.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("user.xml");
        UserController uc = ac.getBean("userController", UserController.class);
        System.out.println(uc);
        UserService us = ac.getBean("userService", UserServiceImpl.class);
        System.out.println(us);
        UserDao ud = ac.getBean("userDao", UserDaoImpl.class);
        System.out.println(ud);
    }
}

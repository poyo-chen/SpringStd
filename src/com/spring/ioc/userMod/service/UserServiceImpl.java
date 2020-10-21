package com.spring.ioc.userMod.service;

import com.spring.ioc.userMod.dao.UserDao;
import com.spring.ioc.userMod.dao.UserDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public UserServiceImpl() {
        System.out.println("UserServiceImpl");
    }

    @Override
    public void addUser() {
        userDao.addUser();
    }
}

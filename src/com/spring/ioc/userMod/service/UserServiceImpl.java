package com.spring.ioc.userMod.service;

import com.spring.ioc.userMod.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public UserServiceImpl() {
        System.out.println("UserServiceImpl");
    }

    //不常用
//    @Autowired
//    @Qualifier(value = "userDaoMybatisImpl")
//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }

    @Override
    public void addUser() {
        userDao.addUser();
    }
}

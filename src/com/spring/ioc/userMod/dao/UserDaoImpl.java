package com.spring.ioc.userMod.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    @Override
    public void addUser() {
        System.out.println("UserDaoImpl add commit");
    }

    public UserDaoImpl() {
        System.out.println("UserDaoImpl");
    }
}

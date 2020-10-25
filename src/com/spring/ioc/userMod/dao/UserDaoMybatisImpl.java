package com.spring.ioc.userMod.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoMybatisImpl implements UserDao{

    @Override
    public void addUser() {
        System.out.println("UserDaoMybatisImpl add commit");
    }

}

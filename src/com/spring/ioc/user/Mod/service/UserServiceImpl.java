package com.spring.ioc.user.Mod.service;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    public UserServiceImpl() {
        System.out.println("UserService");
    }
}

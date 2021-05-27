package com.tongy.spring.service;

import com.tongy.spring.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("add some users");
    }

    @Override
    public void delete() {
        System.out.println("delete some users");
    }

    @Override
    public void update() {
        System.out.println("update some users");
    }

    @Override
    public void query() {
        System.out.println("query some users");
    }
}

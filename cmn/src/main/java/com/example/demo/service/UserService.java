package com.example.demo.service;

import com.example.demo.entity.User;

public interface UserService {

    /**
     * 查询用户
     * @param username, password
     * @return
     */
    public User getUser(String username, String password);

}

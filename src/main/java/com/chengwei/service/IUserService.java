package com.chengwei.service;

import com.chengwei.entity.User;

public interface IUserService {  
    public User getUserById(int userId);
    public User login(String name, String password);
}  
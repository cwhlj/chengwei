package com.chengwei.service.impl;


import com.chengwei.entity.User;
import com.chengwei.mapper.UserMapper;
import com.chengwei.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service("userService")  
public class UserServiceImpl implements IUserService {  
    @Resource  
    private UserMapper userMapper;
    
    public User getUserById(int userId) {  
        return this.userMapper.selectByPrimaryKey(userId);  
    }

	public User login(String name, String password) {
		return userMapper.login(name, password);
	}
    
}
  
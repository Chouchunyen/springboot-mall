package com.jim.springbootmall.service.impl;

import com.jim.springbootmall.dao.UserDao;
import com.jim.springbootmall.dto.UserRegisterRequest;
import com.jim.springbootmall.product.User;
import com.jim.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}

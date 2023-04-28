package com.jim.springbootmall.service;

import com.jim.springbootmall.dto.UserRegisterRequest;
import com.jim.springbootmall.product.User;

public interface UserService {

    User getUserById(Integer userId);
    Integer register(UserRegisterRequest userRegisterRequest);
}

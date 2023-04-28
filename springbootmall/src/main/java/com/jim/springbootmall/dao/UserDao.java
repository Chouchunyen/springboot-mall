package com.jim.springbootmall.dao;

import com.jim.springbootmall.dto.UserRegisterRequest;
import com.jim.springbootmall.product.User;

public interface UserDao {
    User getUserById(Integer userId);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}

package com.jim.springbootmall.controller;


import com.jim.springbootmall.dto.UserRegisterRequest;
import com.jim.springbootmall.product.User;
import com.jim.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/users/register") // 創建資源用Post(restful api)，且資安考量需使用到request body傳遞參數
    public ResponseEntity<User> register(@RequestBody UserRegisterRequest userRegisterRequest) {

        Integer userId = userService.register(userRegisterRequest);


        User user = userService.getUserById(userId);

        return ResponseEntity.status((HttpStatus.CREATED)).body(user);

    }
}

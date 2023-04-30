package com.jim.springbootmall.controller;

import com.jim.springbootmall.dto.BuyItem;
import com.jim.springbootmall.dto.CreateOrderRequest;
import com.jim.springbootmall.product.Order;
import com.jim.springbootmall.product.OrderItem;
import com.jim.springbootmall.product.User;
import com.jim.springbootmall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class OrderContoller {
    @Autowired
    private OrderService orderService;
    @PostMapping("/users/{userId}/orders")
    public ResponseEntity<?> createOrder(@PathVariable Integer userId,
                                         @RequestBody CreateOrderRequest createOrderRequest) {

        Integer orderId = orderService.createOrder( userId,  createOrderRequest );

        Order order = orderService.getOrderById(orderId);

        return ResponseEntity.status(HttpStatus.CREATED).body(order);

    }
}

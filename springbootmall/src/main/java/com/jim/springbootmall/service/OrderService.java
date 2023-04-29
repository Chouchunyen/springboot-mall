package com.jim.springbootmall.service;

import com.jim.springbootmall.dto.CreateOrderRequest;

public interface OrderService {

    Integer createOrder  (Integer userId, CreateOrderRequest createOrderRequest);
}

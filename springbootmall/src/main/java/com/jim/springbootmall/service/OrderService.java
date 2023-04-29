package com.jim.springbootmall.service;

import com.jim.springbootmall.dto.CreateOrderRequest;
import com.jim.springbootmall.product.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder  (Integer userId, CreateOrderRequest createOrderRequest);
}

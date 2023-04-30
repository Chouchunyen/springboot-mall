package com.jim.springbootmall.service;

import com.jim.springbootmall.dto.CreateOrderRequest;
import com.jim.springbootmall.dto.OrderQueryParams;
import com.jim.springbootmall.product.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}

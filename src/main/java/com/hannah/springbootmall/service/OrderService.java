package com.hannah.springbootmall.service;

import com.hannah.springbootmall.dto.CreateOrderRequest;

public interface OrderService {
    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}

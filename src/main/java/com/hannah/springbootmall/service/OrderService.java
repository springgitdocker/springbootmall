package com.hannah.springbootmall.service;

import com.hannah.springbootmall.dto.CreateOrderRequest;
import com.hannah.springbootmall.model.Order;

public interface OrderService {
    Order getOrderById(Integer orderId);
    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}

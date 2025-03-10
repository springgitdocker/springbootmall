package com.hannah.springbootmall.service;

import com.hannah.springbootmall.dto.CreateOrderRequest;
import com.hannah.springbootmall.dto.OrderQueryParams;
import com.hannah.springbootmall.model.Order;
import java.util.List;

public interface OrderService {
    Integer countOrder(OrderQueryParams orderQueryParams);
    List<Order> getOrders(OrderQueryParams orderQueryParams);
    Order getOrderById(Integer orderId);
    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}

package com.hannah.springbootmall.dao;

import com.hannah.springbootmall.dto.OrderQueryParams;
import com.hannah.springbootmall.model.Order;
import com.hannah.springbootmall.model.OrderItem;

import java.util.List;

public interface OrderDao {
    Integer countOrder(OrderQueryParams orderQueryParams);
    List<Order> getOrders(OrderQueryParams orderQueryParams);
    Order getOrderById(Integer orderId);
    List<OrderItem> getOrderItemsByOrderId(Integer orderId);
    Integer createOrder(Integer userId, Integer totalAmount);
    void createOrderItems(Integer userId, List<OrderItem> orderItemList);
}

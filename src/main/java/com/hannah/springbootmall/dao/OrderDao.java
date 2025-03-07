package com.hannah.springbootmall.dao;

import com.hannah.springbootmall.model.OrderItem;
import java.util.List;

public interface OrderDao {
    Integer createOrder(Integer userId, Integer totalAmount);
    void createOrderItems(Integer userId, List<OrderItem> orderItemList);
}

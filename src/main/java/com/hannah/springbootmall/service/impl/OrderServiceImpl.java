package com.hannah.springbootmall.service.impl;

import com.hannah.springbootmall.dao.OrderDao;
import com.hannah.springbootmall.dao.ProductDao;
import com.hannah.springbootmall.dto.BuyItem;
import com.hannah.springbootmall.dto.CreateOrderRequest;
import com.hannah.springbootmall.model.OrderItem;
import com.hannah.springbootmall.model.Product;
import com.hannah.springbootmall.service.OrderService;
import org.apache.tomcat.util.digester.ArrayStack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.ArrayList;

@Component
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private ProductDao productDao;

    @Transactional
    @Override
    public Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest) {
        // 計算訂單總花費資訊
        int totalAmount = 0;
        List<OrderItem> orderItemList = new ArrayList<>();
        for(BuyItem buyItem : createOrderRequest.getBuyItemList()){
            Product product = productDao.getProductById(buyItem.getProductId());

            // 計算總價錢
            int amount = buyItem.getQuantity() * product.getPrice();
            totalAmount += amount;

            // 轉換 BuyItem to OrderItem
            OrderItem orderItem = new OrderItem();
            orderItem.setProductId(buyItem.getProductId());
            orderItem.setQuantity(buyItem.getQuantity());
            orderItem.setAmount(amount);

            orderItemList.add(orderItem);
        }

        // 創建訂單
        Integer orderId = orderDao.createOrder(userId, totalAmount);
        orderDao.createOrderItems(orderId, orderItemList);

        return orderId;
    }
}

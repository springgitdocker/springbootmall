package com.hannah.springbootmall.dao;

import com.hannah.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}

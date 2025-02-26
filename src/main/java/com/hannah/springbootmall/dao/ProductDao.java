package com.hannah.springbootmall.dao;

import com.hannah.springbootmall.dto.ProductRequest;
import com.hannah.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);
}

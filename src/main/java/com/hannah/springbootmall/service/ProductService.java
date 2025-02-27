package com.hannah.springbootmall.service;

import com.hannah.springbootmall.dto.ProductRequest;
import com.hannah.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}

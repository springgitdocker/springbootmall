package com.hannah.springbootmall.dao;

import com.hannah.springbootmall.constant.ProductCategory;
import com.hannah.springbootmall.dto.ProductRequest;
import com.hannah.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductCategory category, String search);
    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);
    void updateProduct(Integer productId, ProductRequest productRequest);
    void deleteProductById(Integer productId);
}

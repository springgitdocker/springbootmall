package com.hannah.springbootmall.dao;

import com.hannah.springbootmall.dto.ProductQueryParams;
import com.hannah.springbootmall.dto.ProductRequest;
import com.hannah.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    Integer countProduct(ProductQueryParams productQueryParams);
    List<Product> getProducts(ProductQueryParams productQueryParams);
    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);
    void updateProduct(Integer productId, ProductRequest productRequest);
    void updateStock(Integer productId, Integer stock);
    void deleteProductById(Integer productId);
}

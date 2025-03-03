package com.hannah.springbootmall.service;

import com.hannah.springbootmall.dto.ProductQueryParams;
import com.hannah.springbootmall.dto.ProductRequest;
import com.hannah.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    Integer countProduct(ProductQueryParams productQueryParams);

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);

}

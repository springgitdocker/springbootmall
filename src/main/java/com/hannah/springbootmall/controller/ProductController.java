package com.hannah.springbootmall.controller;

import com.hannah.springbootmall.constant.ProductCategory;
import com.hannah.springbootmall.dto.ProductRequest;
import com.hannah.springbootmall.model.Product;
import com.hannah.springbootmall.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProducts(
            @RequestParam(required = false) ProductCategory category,
            @RequestParam(required = false)  String search) {
        List<Product> productList = productService.getProducts(category, search);
        return ResponseEntity.status(HttpStatus.OK).body(productList);
    }

    @GetMapping("/products/{productId}")
    public ResponseEntity<Product> getProduct(@PathVariable Integer productId){
        Product product = productService.getProductById(productId);
        if(product != null){
            return ResponseEntity.status(HttpStatus.OK).body(product);
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @PostMapping("/products")
    public ResponseEntity<Product> createProduct(@RequestBody @Valid ProductRequest productRequest){

        Integer productId = productService.createProduct(productRequest);
        Product product = productService.getProductById(productId);

        return ResponseEntity.status(HttpStatus.CREATED).body(product);
    }

    @PutMapping("/products/{productId}")
    public ResponseEntity<Product> updateProduct(@PathVariable Integer productId,
                                                 @RequestBody @Valid ProductRequest productRequest){
        Product product = productService.getProductById(productId);//先找出商品
        if(product == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        productService.updateProduct(productId, productRequest);   //修改商品資料
        Product updateProduct = productService.getProductById(productId);
        return ResponseEntity.status(HttpStatus.OK).body(updateProduct);
    }

    @DeleteMapping("/products/{productId}")
    public ResponseEntity<Product> deleteProductById(@PathVariable Integer productId){
        productService.deleteProductById(productId);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}

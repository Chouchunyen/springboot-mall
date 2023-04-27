package com.jim.springbootmall.service;

import com.jim.springbootmall.constant.ProductCategory;
import com.jim.springbootmall.dto.ProductRequest;
import com.jim.springbootmall.product.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductCategory category,String search);


    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct (Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}

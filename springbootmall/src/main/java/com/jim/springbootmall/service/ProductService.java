package com.jim.springbootmall.service;

import com.jim.springbootmall.dto.ProductRequest;
import com.jim.springbootmall.product.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct (Integer productId, ProductRequest productRequest);
}

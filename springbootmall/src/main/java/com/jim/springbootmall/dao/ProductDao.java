package com.jim.springbootmall.dao;

import com.jim.springbootmall.dto.ProductRequest;
import com.jim.springbootmall.product.Product;

public interface ProductDao {
    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);

    void updateProduct (Integer productId, ProductRequest productRequest);
}

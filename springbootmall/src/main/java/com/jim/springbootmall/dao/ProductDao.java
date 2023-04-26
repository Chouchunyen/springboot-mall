package com.jim.springbootmall.dao;

import com.jim.springbootmall.product.Product;

public interface ProductDao {
    Product getProductById(Integer productId);
}

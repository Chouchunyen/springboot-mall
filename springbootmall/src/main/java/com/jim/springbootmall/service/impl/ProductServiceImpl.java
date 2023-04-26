package com.jim.springbootmall.service.impl;

import com.jim.springbootmall.dao.ProductDao;
import com.jim.springbootmall.product.Product;
import com.jim.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;
    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}



package com.jim.springbootmall.dao;

import com.jim.springbootmall.dto.ProductRequest;
import com.jim.springbootmall.product.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts();

    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);

    void updateProduct (Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);


}

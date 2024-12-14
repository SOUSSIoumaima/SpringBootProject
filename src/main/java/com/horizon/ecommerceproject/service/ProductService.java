package com.horizon.ecommerceproject.service;

import com.horizon.ecommerceproject.entity.Product;

import java.util.List;

public interface ProductService {
    public Product saveProduct(Product product);
    public List<Product> getAllProducts();
    public void deleteProduct(Long id);
}

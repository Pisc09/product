package com.example.product.interfaces;

import com.example.product.entity.Product;

import java.util.List;
import java.util.UUID;

public interface ProductImpl {

    Product findById(UUID id);
    List<Product> findAll();
    List<Product> findByParams(String category, Double price);
}

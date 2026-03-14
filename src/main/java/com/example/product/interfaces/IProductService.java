package com.example.product.interfaces;

import com.example.product.entity.Product;

import java.util.List;
import java.util.UUID;

public interface IProductService {

    Product findById(UUID id); // une pièce de la maison
    List<Product> findAll(); // une autre pièce de la maison
    List<Product> findByParams(String category, Double price); // encore une autre pièce de la maison
}

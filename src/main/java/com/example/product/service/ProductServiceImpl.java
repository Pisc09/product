package com.example.product.service;

import com.example.product.entity.Product;
import com.example.product.interfaces.IProductService;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Service
public class ProductServiceImpl implements IProductService {

    private final List<Product> products = new ArrayList<>();

    @PostConstruct
    public void init() {
        createProducts();
    }

    public void createProducts() {
        products.clear();
        products.add(Product.builder().id(UUID.randomUUID()).name("Laptop").description("A powerful laptop").category("Electronics").price(1000.00).build());
        products.add(Product.builder().id(UUID.randomUUID()).name("Smartphone").description("A smartphone").category("Electronics").price(500.00).build());
        products.add(Product.builder().id(UUID.randomUUID()).name("Tablet").description("A tablet").category("Electronics").price(200.00).build());
        products.add(Product.builder().id(UUID.randomUUID()).name("Spring Boot").description("Learn API Rest with Spring Boot").category("Books").price(50.00).build());
        products.add(Product.builder().id(UUID.randomUUID()).name("Java").description("Learn Java").category("Books").price(30.00).build());
    }

    @Override
    public Product findById(UUID id) {
        // Implementation to find a product by its ID
        return products.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null); // Placeholder return statement
    }

    @Override
    public List<Product> findAll() {
        // Implementation to find all products
        return new ArrayList<>(products); // Placeholder return statement
    }

    @Override
    public List<Product> findByParams(String category, Double price) {
        // Implementation to find products by category and price
        return products.stream()
                .filter(Objects::nonNull) // Placeholder return statement
                .filter(p   ->  (category == null || category.equals(p.getCategory())) &&
                                        (price == null || p.getPrice() <= price))
                .toList();
    }
}

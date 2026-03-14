package com.example.product.controller;

import com.example.product.entity.Product;
import com.example.product.interfaces.ProductImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/products")
public class ProductController {

    private final ProductImpl productService;

    public ProductController(ProductImpl productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Product getProductById(@PathVariable("id") UUID id) {
        // Implementation to get a product by its ID
        return productService.findById(id); // Placeholder return statement
    }

    @GetMapping("/all")
    @ResponseBody
    public List<Product> getAllProducts() {
        // Implementation to get all products
        return productService.findAll(); // Placeholder return statement
    }

    @GetMapping("/search")
    @ResponseBody
    public List<Product> searchProducts(@RequestParam(value = "category", required = false) String category, @RequestParam(value = "price", required = false) Double price) {
        return productService.findByParams(category, price); // Placeholder return statement
    }
}

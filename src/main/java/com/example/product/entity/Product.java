package com.example.product.entity;

import lombok.*;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Product {

    private UUID id;
    private String name;
    private String description;
    private String category;
    private Double price;
}

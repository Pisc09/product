package com.example.product.model.dto.response;

import java.util.UUID;

public record ProductResponse(

        UUID id,
        String name,
        String description,
        String category,
        Double price
) {

}

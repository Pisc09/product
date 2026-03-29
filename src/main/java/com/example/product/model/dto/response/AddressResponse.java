package com.example.product.model.dto.response;

import java.util.UUID;

public record AddressResponse(

        UUID id,
        String street,
        String city,
        String country,
        String postalCode,
        String codePromo
) {

}

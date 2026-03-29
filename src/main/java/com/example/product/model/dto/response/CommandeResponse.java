package com.example.product.model.dto.response;

import com.example.product.model.enums.StatutCommande;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public record CommandeResponse(

        UUID id,
        LocalDateTime dateCommande,
        BigDecimal totalCommande,
        StatutCommande statut
) {

}

package com.example.product.model.dto.request;

import com.example.product.model.enums.StatutCommande;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
public class CommandeRequest {

    @NotNull(message = "La date de commande est obligatoire")
    @PastOrPresent(message = "La date ne peut pas être dans le futur")
    private LocalDateTime dateCommande;

    @NotNull(message = "Le montant total est obligatoire")
    @Positive(message = "Le montant total doit être positif")
    private BigDecimal totalCommande;

    @NotNull(message = "Le statut de la commande est obligatoire")
    private StatutCommande statut;
}

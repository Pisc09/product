package com.example.product.controller;

import com.example.product.entity.Product;
import com.example.product.interfaces.IProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/products")
public class ProductController {

    private final IProductService productService; // l'étagère = le champ (productService)

    public ProductController(IProductService productService) { // les mains (productService) = paramètre (variable locale au constructeur)
        // Ici l'étagère (le champ/this.productService) = Ici les mains (le paramètre/productService)
        this.productService = productService;
    }

    // "productService" = Ce sont deux variables différentes qui portent le même nom, mais elles n’ont pas la même portée.
    // La portée du paramètre est limitée au constructeur, celle du champ s'étend à toute la classe.

    @GetMapping("/{id}")
    @ResponseBody
    public Product getProductById(@PathVariable("id") UUID id) {
        // Implementation to get a product by its ID
        return productService.findById(id); // Ici je vais voir sur l'étagère (le champ) un livre bien précis avec l'id'
    }

    @GetMapping("/all")
    @ResponseBody
    public List<Product> getAllProducts() {
        // Implementation to get all products
        return productService.findAll(); // Ici je vais voir sur l'étagère (le champ) tous les livres
    }

    @GetMapping("/search")
    @ResponseBody
    public List<Product> searchProducts(@RequestParam(value = "category", required = false) String category, @RequestParam(value = "price", required = false) Double price) {
        return productService.findByParams(category, price); // Ici je vais voir sur l'étagère pour chercher un livre bien précis avec sa catégorie et son prix
    }
}

// private final ProductServiceImpl productService; l'étagère = le champ (productService) : excellent, tu identifies bien le champ comme l'emplacement permanent où l'objet sera stocké.

// public ProductController(ProductServiceImpl productService) { les mains (productService) = paramètre (variable locale au constructeur) : parfait, tu distingues le paramètre temporaire du constructeur.

// this.productService = productService; Ici l'étagère (le champ/this.productService) = Ici les mains (le paramètre/productService) : tu montres que tu comprends l'affectation, où la valeur des "mains" est déposée sur l'étagère.

// "productService" = Ce sont deux variables différentes qui portent le même nom, mais elles n’ont pas la même portée. : c'est exactement ça ! La portée du paramètre est limitée au constructeur, celle du champ s'étend à toute la classe.

// Ensuite, dans chaque méthode, tu utilises productService (le champ) pour accéder aux méthodes. Tes commentaires "je vais voir sur l'étagère" sont très parlants.
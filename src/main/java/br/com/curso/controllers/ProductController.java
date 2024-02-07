package br.com.curso.controllers;

import org.springframework.web.bind.annotation.RestController;

import br.com.curso.domain.product.Product;
import br.com.curso.domain.product.ProductRequestDTO;
import br.com.curso.repository.ProductRepository;
import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("product")
public class ProductController {
    @Autowired
    ProductRepository repository;

    @PostMapping
    public ResponseEntity postProduct(@RequestBody @Valid ProductRequestDTO body) {
        Product newProduct = new Product(body);
        this.repository.save(newProduct);
        
        return ResponseEntity.ok().build();
    }
    
}

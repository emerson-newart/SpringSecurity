package br.com.curso.controllers;

import org.springframework.web.bind.annotation.RestController;

import br.com.curso.domain.product.ProductRequestDTO;
import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("product")
public class ProductController {
    
    @PostMapping
    public ResponseEntity postProduct(@RequestBody @Valid ProductRequestDTO body) {
        return ResponseEntity.ok().build();
    }
    
}

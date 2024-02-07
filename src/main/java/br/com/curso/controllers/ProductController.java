package br.com.curso.controllers;

import org.springframework.web.bind.annotation.RestController;

import br.com.curso.domain.product.Product;
import br.com.curso.domain.product.ProductRequestDTO;
import br.com.curso.domain.product.ProductResponseDTO;
import br.com.curso.repository.ProductRepository;
import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



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

    @GetMapping
    public ResponseEntity getAllProducts() {
      List<ProductResponseDTO> productList = this.repository.findAll().stream().map(ProductResponseDTO::new).toList();
      return ResponseEntity.ok(productList);
    }
    
}

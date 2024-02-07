package br.com.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.curso.domain.product.Product;

public interface ProductRepository extends JpaRepository<Product, String>{
    
}

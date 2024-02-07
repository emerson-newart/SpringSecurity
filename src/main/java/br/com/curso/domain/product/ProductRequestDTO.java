package br.com.curso.domain.product;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ProductRequestDTO (@NotBlank String nome, @NotNull Integer price){
    
}

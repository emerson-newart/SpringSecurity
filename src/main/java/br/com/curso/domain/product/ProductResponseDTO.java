package br.com.curso.domain.product;

public record ProductResponseDTO (String id, String nome, Integer price){

    public ProductResponseDTO(Product product){
        this(product.getId(), product.getNome(), product.getPrice());
    }
    
}

package br.com.curso.domain.user;

public record RegisterDTO(String login, String password, UsuarioRole role) {
    
}

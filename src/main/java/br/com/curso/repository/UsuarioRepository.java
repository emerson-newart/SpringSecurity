package br.com.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import br.com.curso.domain.user.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, String>{
    
    UserDetails findByLogin(String login);
}

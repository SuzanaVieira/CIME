package com.monitoria.LTP.repository;

import org.springframework.data.repository.CrudRepository;

import com.monitoria.LTP.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

    Usuario findByUsername(String username);
    
}

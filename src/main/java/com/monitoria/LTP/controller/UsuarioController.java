package com.monitoria.LTP.controller;

import java.util.List;

import javax.xml.crypto.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.monitoria.LTP.model.Usuario;
import com.monitoria.LTP.repository.UsuarioRepository;

@RestController
@CrossOrigin
public class UsuarioController {
    @Autowired
    UsuarioRepository usuariosRepository;

    @GetMapping("/usuario")
    public List<Usuario> listarUsuarios() {
        return (List<Usuario>) usuariosRepository.findAll();
    }

    @PostMapping("/cadastro/usuario")
    public Usuario criarUsuario(@RequestBody Usuario novo) {
        return usuariosRepository.save(novo);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletarUsuario(@PathVariable("id") Long id) {
        usuariosRepository.deleteById(id);
    }
}

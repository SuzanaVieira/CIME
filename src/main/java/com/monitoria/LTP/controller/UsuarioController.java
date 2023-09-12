package com.monitoria.LTP.controller;

import java.util.List;

import javax.xml.crypto.Data;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.monitoria.LTP.DataBase;
import com.monitoria.LTP.model.Usuario;
import com.monitoria.LTP.model.UsuarioDAO;

@RestController
public class UsuarioController {
    @GetMapping("/usuario")
    public List<Usuario> listarUsuarios() {
        return DataBase.recuperarDadoUsuario();
    }

    @PostMapping("/cadastro/usuario")
    public void criarUsuario(@RequestBody Usuario novo) {
        DataBase.save(novo);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletarUsuario(@PathVariable int id) {
        UsuarioDAO usu = UsuarioDAO.getInstance();
        List<Usuario> usuarios = usu.findAll();
        for (Usuario usuario : usuarios) {
            if(usuario.getId() == id){
                usu.delete(usuario);
            }
        }
    }
}

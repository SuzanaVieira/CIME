package com.monitoria.LTP.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
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
    UsuarioRepository usuarioRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @GetMapping("/usuario")
    public List<Usuario> listarUsuarios() {
        return (List<Usuario>) usuarioRepository.findAll();
    }

    @PostMapping("/cadastro/usuario")
    public String criarUsuario(@RequestBody Usuario novoUser) {
        novoUser.setPassword(
            passwordEncoder.encode(novoUser.getPassword())
        );
        Usuario usuarioCriado = usuarioRepository.save(novoUser);

        if(usuarioCriado != null)
            return "Usuário criado com sucesso!";        
        
        return "Erro ao criar usuário";
    }

    @DeleteMapping("usuario/deletar/{id}")
    public void deletarUsuario(@PathVariable("id") Long id) {
        usuarioRepository.deleteById(id);
    }
}

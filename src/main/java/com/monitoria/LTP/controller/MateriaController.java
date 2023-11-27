package com.monitoria.LTP.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.monitoria.LTP.model.Materia;
import com.monitoria.LTP.repository.MateriaRepository;

@RestController
@CrossOrigin
public class MateriaController {
    @Autowired
    MateriaRepository materiaRepository;

    @GetMapping("/materia")
    public List<Materia> listar() {
        return (List<Materia>) materiaRepository.findAll();
    }

    @PostMapping("/cadastro/materia")
    public Materia criar(@RequestBody Materia novo) {
        return materiaRepository.save(novo);
    }

    @DeleteMapping("materia/deletar/{id}")
    public void deletar(@PathVariable("id") Long id) {
        materiaRepository.deleteById(id);
    }
}

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
import com.monitoria.LTP.model.Materia;
import com.monitoria.LTP.model.MateriaDAO;

@RestController
public class MateriaController {
    @GetMapping("/materia")
    public List<Materia> listar() {
        return DataBase.recuperarDadoMateria();
    }

    @PostMapping("/cadastro/materia")
    public void criar(@RequestBody Materia novo) {
        DataBase.save(novo);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletar(@PathVariable int id) {
        MateriaDAO mate = MateriaDAO.getInstance();
        List<Materia> materias = mate.findAll();
        for (Materia materia : materias) {
            if(materia.getId() == id){
                mate.delete(materia);
            }
        }
    }
}

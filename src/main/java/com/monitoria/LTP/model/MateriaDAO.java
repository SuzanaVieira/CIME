package com.monitoria.LTP.model;

import java.util.ArrayList;
import java.util.List;

import com.monitoria.LTP.DataBase;

public class MateriaDAO {
    private DataBase db;
    private static MateriaDAO instance;

    public MateriaDAO() {
    }

    public static MateriaDAO getInstance(){
        if(instance == null){
            instance = new MateriaDAO();
        }
        return instance;
    }

    // Recupera a conexão com o Banco de Dados
    private DataBase getConnection(){
        if(this.db == null){            
            DataBase db = new DataBase();
            db.init();
            this.db = db;
        }
        return this.db;    
    }

    public void create(Materia novo){
        DataBase db = getConnection();
        db.save(novo);
    }   

    public ArrayList<Materia> read(){
        DataBase db = getConnection();
        return db.recuperarDadoMateria();
    }

    public void delete(Materia deletar) {
        DataBase db = getConnection();
        db.removerMateria(deletar);
    }

    public List<Materia> findAll() {
        return (ArrayList<Materia>) DataBase.all();
    }
}

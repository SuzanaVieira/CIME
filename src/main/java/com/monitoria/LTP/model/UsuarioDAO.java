package com.monitoria.LTP.model;

import java.util.ArrayList;
import java.util.List;

import com.monitoria.LTP.DataBase;

public class UsuarioDAO {
    private DataBase db;
    private static UsuarioDAO instance;

    public UsuarioDAO() {
    }

    public static UsuarioDAO getInstance(){
        if(instance == null){
            instance = new UsuarioDAO();
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

    public void create(Usuario novo){
        DataBase db = getConnection();
        db.save(novo);
    }   

    public ArrayList<Usuario> read(){
        DataBase db = getConnection();
        return db.recuperarDadoUsuario();
    }

    public void delete(Usuario deletar) {
        DataBase db = getConnection();
        db.removerUsuario(deletar);
    }

    public List<Usuario> findAll() {
        return (ArrayList<Usuario>) DataBase.all();
    }
}

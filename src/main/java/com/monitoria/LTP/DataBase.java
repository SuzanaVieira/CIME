/*
package com.monitoria.LTP;

import java.util.ArrayList;
import java.util.List;

import com.monitoria.LTP.model.Usuario;

public class DataBase {
    private static ArrayList<Usuario> usuarios;

    public DataBase() {
        usuarios = new ArrayList<>();
    }

    public static void init(){
        usuarios = new ArrayList<Usuario>();
        usuarios.add(new Usuario(1, "suzana", "BP000000", "3 INFO", "suzana@gmail.com"));
    }
    
    public static void save(Usuario novo){
        usuarios.add(novo);
    }

    public static ArrayList<Usuario> recuperarDadoUsuario(){
        return usuarios;
    }

    public static void removerUsuario(Usuario usuario) {
        usuarios.remove(usuario);
    }

    public static List<Usuario> all(){
        return usuarios;
    }
}
*/
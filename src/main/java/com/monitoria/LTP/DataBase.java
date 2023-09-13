package com.monitoria.LTP;

import java.util.ArrayList;
import java.util.List;

import com.monitoria.LTP.model.Materia;

public class DataBase {
    private static ArrayList<Materia> materias;

    public DataBase() {
        materias = new ArrayList<>();
    }

    public static void init(){
        materias = new ArrayList<Materia>();
        materias.add(new Materia(0, "Portugues", "3 Horas", "Roberta"));
    }
    
    public static void save(Materia novo){
        materias.add(novo);
    }

    public static ArrayList<Materia> recuperarDadoMateria(){
        return materias;
    }

    public static void removerMateria(Materia materia) {
        materias.remove(materia);
    }

    public static List<Materia> all(){
        return materias;
    }
}

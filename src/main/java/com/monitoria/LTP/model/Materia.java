package com.monitoria.LTP.model;

public class Materia {
    private int id;
    private String disciplina;
    private String cargaHoraria;
    private String professor;
    
    public Materia(int id, String disciplina, String cargaHoraria, String professor) {
        this.id = id;
        this.disciplina = disciplina;
        this.cargaHoraria = cargaHoraria;
        this.professor = professor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }
    
}

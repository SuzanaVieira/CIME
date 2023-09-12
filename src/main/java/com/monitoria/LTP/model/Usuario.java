package com.monitoria.LTP.model;

public class Usuario {
    private int id;
    private String nome;
    private String prontuario;
    private String turma;
    protected String email;
    
    public Usuario(int id, String nome, String prontuario, String turma, String email) {
        this.id = id;
        this.nome = nome;
        this.prontuario = prontuario;
        this.turma = turma;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProntuario() {
        return prontuario;
    }

    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

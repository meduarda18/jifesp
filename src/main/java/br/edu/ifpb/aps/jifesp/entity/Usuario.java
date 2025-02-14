package br.edu.ifpb.aps.jifesp.entity;

public class Usuario {
    int idUsuario;
    String nome;
    int matricula;
    
    public Usuario( String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }
    public int getIdUsuario() {
        return idUsuario;
    }
    public String getNome() {
        return nome;
    }
    public int getMatricula() {
        return matricula;
    }
    
    void buscarModalidade(){}
    void buscarJogo(){}
    void buscarRegulamento(){}
    void buscarResultados(){}
}

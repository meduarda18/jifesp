package br.edu.ifpb.aps.jifesp.entity;

public class Campeonato {
    int idCampeonato;
    String nome;

    public Campeonato(String nome) {
        this.nome = nome;
    }
    
    public int getIdCampeonato() {
        return idCampeonato;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
}

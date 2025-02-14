package br.edu.ifpb.aps.jifesp.entity;

public class Campeonato {
    int id_campeonato;
    String nome;

    public Campeonato(int id_campeonato, String nome) {
        this.id_campeonato = id_campeonato;
        this.nome = nome;
    }
    
    public int getId_campeonato() {
        return id_campeonato;
    }
    public void setId_campeonato(int id_campeonato) {
        this.id_campeonato = id_campeonato;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}

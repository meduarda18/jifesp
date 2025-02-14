package br.edu.ifpb.aps.jifesp.entity;

public class Regulamento {
    int id_regulamento;
    NomeModalidade nome;
    String descricao;
    
    public Regulamento(NomeModalidade nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }
    
    public int getId_regulamento() {
        return id_regulamento;
    }
    public void setId_regulamento(int id_regulamento) {
        this.id_regulamento = id_regulamento;
    }
    public NomeModalidade getNome() {
        return nome;
    }
    public void setNome(NomeModalidade nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

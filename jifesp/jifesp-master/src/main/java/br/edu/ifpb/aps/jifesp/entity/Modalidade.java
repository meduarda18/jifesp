package br.edu.ifpb.aps.jifesp.entity;

public class Modalidade {
    int id_modalidade;
    NomeModalidade nome;
    
    int quantidadeParticipantes;
    

    public Modalidade(int id_modalidade, NomeModalidade nome, int quantidadeParticipantes) {
        this.id_modalidade = id_modalidade;
        this.nome = nome;
        this.quantidadeParticipantes = quantidadeParticipantes;
    }
    public int getId_modalidade() {
        return id_modalidade;
    }
    public void setId_modalidade(int id_modalidade) {
        this.id_modalidade = id_modalidade;
    }
    public NomeModalidade getNome() {
        return nome;
    }
    public void setNome(NomeModalidade nome) {
        this.nome = nome;
    }
    public int getQuantidadeParticipantes() {
        return quantidadeParticipantes;
    }
    public void setQuantidadeParticipantes(int quantidadeParticipantes) {
        this.quantidadeParticipantes = quantidadeParticipantes;
    }

}

package br.edu.ifpb.aps.jifesp.entity;
public class Atleta {
    int idAtleta;
    String nome;
    int matricula;
    Situacao situacao;

    public Atleta(String nome, int matricula, Situacao situacao) {
        this.nome = nome;
        this.matricula = matricula;
        this.situacao = situacao;
    }
    public int getIdAtleta() {
        return idAtleta;
    }
    public String getNome() {
        return nome;
    }
    public int getMatricula() {
        return matricula;
    }
    public Situacao getSituacao() {
        return situacao;
    }
    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    void inscreveModalidade(){}
    void inscreveEquipe(){}
    void buscaModalidade(){}
    void buscarJogo(){}
    void buscarRegulamento(){}
}


package br.edu.ifpb.aps.jifesp.entity;
public class Atleta {
    int id_atleta;
    String nome;
    int matricula;
    Situacao situacao;

    public Atleta(String nome, int matricula, Situacao situacao) {
        this.nome = nome;
        this.matricula = matricula;
        this.situacao = situacao.INAPTO;
    }
    public int getId_atleta() {
        return id_atleta;
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


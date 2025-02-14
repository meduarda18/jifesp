package br.edu.ifpb.aps.jifesp.entity;

import java.util.List;

public class Equipe {
    int idEquipe;
    String nome;
    String nomeCapitao;
    List<Atleta> jogadores;
    List<Integer> matriculas;

    public Equipe(String nome, String nomeCapitao, List<Atleta> jogadores, List<Integer> matriculas) {
        this.nome = nome;
        this.nomeCapitao = nomeCapitao;
        this.jogadores = jogadores;
        this.matriculas = matriculas;
    }

    public int getIdEquipe() {
        return idEquipe;
    }
    public String getNome() {
        return nome;
    }
    public String getNomeCapitao() {
        return nomeCapitao;
    }
    public List<Atleta> getJogadores() {
        return jogadores;
    }
    public List<Integer> getMatriculas() {
        return matriculas;
    }

}

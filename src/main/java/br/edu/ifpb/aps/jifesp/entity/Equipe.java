package br.edu.ifpb.aps.jifesp.entity;

import java.util.List;

public class Equipe {
    int idEquipe;
    String nomeEquipe;
    String nomeCapitao;
    List<Atleta> jogadores;
    List<Integer> matriculas;

    public Equipe(String nomeEquipe, String nomeCapitao, List<Atleta> jogadores, List<Integer> matriculas) {
        this.nomeEquipe = nomeEquipe;
        this.nomeCapitao = nomeCapitao;
        this.jogadores = jogadores;
        this.matriculas = matriculas;
    }

    public int getIdEquipe() {
        return idEquipe;
    }
    public String getNomeEquipe() {
        return nomeEquipe;
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

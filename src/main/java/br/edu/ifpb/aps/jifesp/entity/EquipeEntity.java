package br.edu.ifpb.aps.jifesp.entity;

import java.util.List;

public class EquipeEntity {
    private Long idEquipe;
    private String nomeEquipe;
    private String nomeCapitao;
    private List<AtletaEntity> jogadores;
    private List<Integer> matriculas;

    public EquipeEntity(String nomeEquipe, String nomeCapitao, List<AtletaEntity> jogadores, List<Integer> matriculas) {
        this.nomeEquipe = nomeEquipe;
        this.nomeCapitao = nomeCapitao;
        this.jogadores = jogadores;
        this.matriculas = matriculas;
    }

    public Long getIdEquipe() {
        return idEquipe;
    }
    public String getNomeEquipe() {
        return nomeEquipe;
    }
    public String getNomeCapitao() {
        return nomeCapitao;
    }
    public List<AtletaEntity> getJogadores() {
        return jogadores;
    }
    public List<Integer> getMatriculas() {
        return matriculas;
    }

}

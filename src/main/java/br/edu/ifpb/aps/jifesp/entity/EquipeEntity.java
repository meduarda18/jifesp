package br.edu.ifpb.aps.jifesp.entity;

import java.util.List;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "equipes")
public class EquipeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    @ManyToMany
    public List<AtletaEntity> getJogadores() {
        return jogadores;
    }
    public List<Integer> getMatriculas() {
        return matriculas;
    }

}

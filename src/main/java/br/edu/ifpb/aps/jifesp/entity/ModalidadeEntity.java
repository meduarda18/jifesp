package br.edu.ifpb.aps.jifesp.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "modalidade")
public class ModalidadeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idModalidade;
    private NomeModalidade nome;
    private int quantidadeParticipantes;
    private RegulamentoEntity regulamento;
    private List<AtletaEntity> atletas;
    private List<EquipeEntity> equipes;

    public ModalidadeEntity(NomeModalidade nome, int quantidadeParticipantes) {
        this.nome = nome;
        this.quantidadeParticipantes = quantidadeParticipantes;
    }

    public Long getIdModalidade() {
        return idModalidade;
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

    public RegulamentoEntity getRegulamento() {
        return regulamento;
    }

    public boolean isColetiva() {
        return nome.isColetiva();
    }

    public List<AtletaEntity> getAtletas() {
        return atletas;
    }

    public void setAtletas(List<AtletaEntity> atletas) {
        this.atletas = atletas;
    }

    public List<EquipeEntity> getEquipes() {
        return equipes;
    }

    public void setEquipes(List<EquipeEntity> equipes) {
        this.equipes = equipes;
    }
}

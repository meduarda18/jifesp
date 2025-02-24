package br.edu.ifpb.aps.jifesp.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "regulamentos")
public class RegulamentoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRegulamento;
    private NomeModalidade nome;
    private String descricao;
    
    public RegulamentoEntity(NomeModalidade nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }
    
    public int getIdRegulamento() {
        return idRegulamento;
    }
    
    @Enumerated(EnumType.STRING)
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

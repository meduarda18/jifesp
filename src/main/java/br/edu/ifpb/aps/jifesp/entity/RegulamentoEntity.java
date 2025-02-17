package br.edu.ifpb.aps.jifesp.entity;

public class RegulamentoEntity {
    int idRegulamento;
    NomeModalidade nome;
    String descricao;
    
    public RegulamentoEntity(NomeModalidade nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }
    
    public int getIdRegulamento() {
        return idRegulamento;
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

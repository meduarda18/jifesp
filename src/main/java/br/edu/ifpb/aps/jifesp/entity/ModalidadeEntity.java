package br.edu.ifpb.aps.jifesp.entity;

public class ModalidadeEntity {
    Long idModalidade;
    NomeModalidade nome;
    int quantidadeParticipantes;
    

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

}

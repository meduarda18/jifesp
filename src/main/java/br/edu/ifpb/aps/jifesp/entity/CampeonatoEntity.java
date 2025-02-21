package br.edu.ifpb.aps.jifesp.entity;

public class CampeonatoEntity {
    private Long idCampeonato;
    private String nome;

    public CampeonatoEntity(String nome) {
        this.nome = nome;
    }
    
    public Long getIdCampeonato() {
        return idCampeonato;
    }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
}

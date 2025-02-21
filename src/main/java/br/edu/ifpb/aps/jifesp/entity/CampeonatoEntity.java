package br.edu.ifpb.aps.jifesp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="campeonato")
public class CampeonatoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

package br.edu.ifpb.aps.jifesp.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "jogos")
public class JogoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idJogo;
    private List<AtletaEntity> participantes;
    private List<EquipeEntity> equipes;
    private int placar;

    public JogoEntity(List<AtletaEntity> participantes, List<EquipeEntity> equipes, int placar) {
        this.participantes = participantes;
        this.equipes = equipes;
        this.placar = placar;
    }

    public Long getIdJogo() {
        return idJogo;
    }

    @ManyToMany
    public List<AtletaEntity> getParticipantes() {
        return participantes;
    }

    public List<EquipeEntity> getEquipes() {
        return equipes;
    }

    public int getPlacar() {
        return placar;
    }

    public void setPlacar(int placar) {
        this.placar = placar;
    }

}

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
    private int placar;

    public JogoEntity(List<AtletaEntity> participantes, int placar) {
        this.participantes = participantes;
        this.placar = placar;
    }

    public Long getIdJogo() {
        return idJogo;
    }

    @ManyToMany
    public List<AtletaEntity> getParticipantes() {
        return participantes;
    }

    public int getPlacar() {
        return placar;
    }

    public void setPlacar(int placar) {
        this.placar = placar;
    }

}

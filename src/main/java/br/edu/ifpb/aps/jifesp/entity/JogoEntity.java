package br.edu.ifpb.aps.jifesp.entity;

import java.util.List;

public class JogoEntity {
    Long idJogo;
    List<AtletaEntity> participantes;
    int placar;
    
    public JogoEntity(List<AtletaEntity> participantes, int placar) {
        this.participantes = participantes;
        this.placar = placar;
    }
    public Long getIdJogo() {
        return idJogo;
    }
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

package br.edu.ifpb.aps.jifesp.entity;

import java.util.List;

public class Jogo {
    int idJogo;
    List<Atleta> participantes;
    int placar;
    
    public Jogo(List<Atleta> participantes, int placar) {
        this.participantes = participantes;
        this.placar = placar;
    }
    public int getIdJogo() {
        return idJogo;
    }
    public List<Atleta> getParticipantes() {
        return participantes;
    }
    public int getPlacar() {
        return placar;
    }
    public void setPlacar(int placar) {
        this.placar = placar;
    }

}

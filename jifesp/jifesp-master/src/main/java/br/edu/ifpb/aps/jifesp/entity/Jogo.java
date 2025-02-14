package br.edu.ifpb.aps.jifesp.entity;

import java.util.List;

public class Jogo {
    int id_jogo;
    List<Atleta> participantes;
    int placar;
    
    public Jogo(int id_jogo, List<Atleta> participantes, int placar) {
        this.id_jogo = id_jogo;
        this.participantes = participantes;
        this.placar = placar;
    }
    public int getId_jogo() {
        return id_jogo;
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

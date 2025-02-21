package br.edu.ifpb.aps.jifesp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "equipes")
public class SumulaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSumula;
    private JogoEntity jogo;
    private String fase;
    private int resultado;
    private String observacoes;
    
    public SumulaEntity(JogoEntity jogo, String fase, int resultado, String observacoes) {
        this.jogo = jogo;
        this.fase = fase;
        this.resultado = resultado;
        this.observacoes = observacoes;
    }
    public int getIdSumula() {
        return idSumula;
    }
    public JogoEntity getJogo() {
        return jogo;
    }
    public String getFase() {
        return fase;
    }
    public int getResultado() {
        return resultado;
    }
    public String getObservacoes() {
        return observacoes;
    }

}

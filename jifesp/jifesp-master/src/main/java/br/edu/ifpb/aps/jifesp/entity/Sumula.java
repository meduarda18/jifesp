package br.edu.ifpb.aps.jifesp.entity;

public class Sumula {
    int id_sumula;
    Jogo jogo;
    String fase;
    int resultado;
    String observacoes;
    
    public Sumula(Jogo jogo, String fase, int resultado, String observacoes) {
        this.jogo = jogo;
        this.fase = fase;
        this.resultado = resultado;
        this.observacoes = observacoes;
    }
    public int getId_sumula() {
        return id_sumula;
    }
    public Jogo getJogo() {
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

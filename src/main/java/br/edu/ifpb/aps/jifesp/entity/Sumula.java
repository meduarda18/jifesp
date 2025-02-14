package br.edu.ifpb.aps.jifesp.entity;

public class Sumula {
    int idSumula;
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
    public int getIdSumula() {
        return idSumula;
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

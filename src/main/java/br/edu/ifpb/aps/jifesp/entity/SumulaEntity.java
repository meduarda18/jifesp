package br.edu.ifpb.aps.jifesp.entity;

public class SumulaEntity {
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

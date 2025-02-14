package br.edu.ifpb.aps.jifesp.entity;

public class Monitor extends Usuario {

    public Monitor(String nome, int matricula) {
        super(nome, matricula);
    }
    
    @Override
    public String getNome() {
        return super.getNome();
    }
    @Override
    public int getMatricula() {
        return super.getMatricula();
    }
    
    void registrarJogo(){}
    void registrarResultado(){}
}

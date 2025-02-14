package br.edu.ifpb.aps.jifesp.entity;

import lombok.Getter;
import lombok.Setter;

public class Atleta {

    @Getter
    private Long id;
    @Getter
    @Setter
    private String nome;
    @Getter
    @Setter
    private String situacao;
    @Getter
    @Setter
    private int matricula;

    //construtor padrão caso preciso do jpa
    public Atleta() {
    }

    public Atleta(String nome, String situacao, int matricula) {
        this.nome = nome;
        this.situacao = situacao;
        this.matricula = matricula;
    }
}

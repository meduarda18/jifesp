package br.edu.ifpb.aps.jifesp.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;
    private String nome;
    private int matricula;
    
    protected UsuarioEntity(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }
    public Long getIdUsuario() {
        return idUsuario;
    }
    public String getNome() {
        return nome;
    }
    public int getMatricula() {
        return matricula;
    }
    
    void buscarModalidade(){}
    void buscarJogo(){}
    void buscarRegulamento(){}
    void buscarResultados(){}
}

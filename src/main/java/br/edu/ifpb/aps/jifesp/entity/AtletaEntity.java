package br.edu.ifpb.aps.jifesp.entity;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "atletas")
public class AtletaEntity extends UsuarioEntity {

    private Situacao situacao;
    private List<ModalidadeEntity> modalidades;

    public AtletaEntity(String nome, int matricula){
        super(nome, matricula);
    }

    public AtletaEntity(String nome, int matricula, Situacao situacao, List<ModalidadeEntity> modalidades) {
        super(nome, matricula);
        this.situacao = situacao;
        this.modalidades = modalidades;
    }

    @ManyToMany
    public List<ModalidadeEntity> getModalidades(){ return modalidades; }

    @Enumerated(EnumType.STRING)
    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

}


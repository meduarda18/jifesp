package br.edu.ifpb.aps.jifesp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="monitores")
public class MonitorEntity extends UsuarioEntity {

    public MonitorEntity(String nome, int matricula) {
        super(nome, matricula);
    }

    void registrarJogo(){}
    void registrarResultado(){}
}

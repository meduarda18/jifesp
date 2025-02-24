package br.edu.ifpb.aps.jifesp.entity;

import java.util.Optional;

public class ProfessorEntity extends UsuarioEntity {

    public ProfessorEntity(String nome, int matricula) {
        super(nome, matricula);
    }


    void sortearChaves(){}

    public Optional<ProfessorEntity> findById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }




    
}

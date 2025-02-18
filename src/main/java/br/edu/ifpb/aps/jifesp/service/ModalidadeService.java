package br.edu.ifpb.aps.jifesp.service;

import java.util.List;

import java.util.Optional;

import br.edu.ifpb.aps.jifesp.entity.ModalidadeEntity;
import br.edu.ifpb.aps.jifesp.repository.ModalidadeRepository;

public class ModalidadeService implements CrudService<ModalidadeEntity, Long>{

    private final ModalidadeRepository modalidadeRepository;

    public ModalidadeService(ModalidadeRepository modalidadeRepository){
        this.modalidadeRepository = modalidadeRepository;
    }

    @Override
    public ModalidadeEntity save(ModalidadeEntity modalidadeEntity) {
        return modalidadeRepository.save(modalidadeEntity);
    }

    @Override
    public ModalidadeEntity update(Long id, ModalidadeEntity modalidadeEntity) {
        Optional<ModalidadeEntity> modalidadeExistente = modalidadeRepository.findById(id);
        if (modalidadeExistente.isPresent()) {
            return modalidadeRepository.save(modalidadeEntity);
        }
        System.out.println("Modalidade não encontrada.");
        return null;
    }

    @Override
    public void delete(Long id) {
        if (modalidadeRepository.existsById(id)) {
            modalidadeRepository.deleteById(id);
            System.out.println("Modalidade removida com sucesso.");
        } else {
            System.out.println("Modalidade não encontrada.");
        }
    }
    
    
    @Override
    public List<ModalidadeEntity> findAll() {
        return modalidadeRepository.findAll();
    }
}
package br.edu.ifpb.aps.jifesp.service;

import java.util.List;
import java.util.Optional;

import br.edu.ifpb.aps.jifesp.entity.RegulamentoEntity;
import br.edu.ifpb.aps.jifesp.repository.RegulamentoRepository;

public class RegulamentoService implements CrudService<RegulamentoEntity, Long>{
    private final RegulamentoRepository regulamentoRepository;

    public RegulamentoService(RegulamentoRepository regulamentoRepository){
        this.regulamentoRepository = regulamentoRepository;
    }
    @Override
    public RegulamentoEntity save(RegulamentoEntity regulamentoEntity) {
        return regulamentoRepository.save(regulamentoEntity);
    }

    @Override
    public RegulamentoEntity update(Long id, RegulamentoEntity regulamentoEntity) {
        Optional<RegulamentoEntity> regulamentoExistente = regulamentoRepository.findById(id);
        if (regulamentoExistente.isPresent()) {
            return regulamentoRepository.save(regulamentoEntity);
        }
        System.out.println("Regulamento não encontrado.");
        return null;
    }

    @Override
    public void delete(Long id) {
        if (regulamentoRepository.existsById(id)) {
            regulamentoRepository.deleteById(id);
            System.out.println("Regulamento removido com sucesso.");
        } else {
            System.out.println("Regulamento não encontrado.");
        }
    }

    @Override
    public List<RegulamentoEntity> findAll() {
        return regulamentoRepository.findAll();
    }
    
}

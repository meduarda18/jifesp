package br.edu.ifpb.aps.jifesp.service;

import br.edu.ifpb.aps.jifesp.entity.AtletaEntity;
import br.edu.ifpb.aps.jifesp.repository.AtletaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AtletaService implements CrudService<AtletaEntity, Long> {

    private final AtletaRepository atletaRepository;

    public AtletaService(AtletaRepository atletaRepository){
        this.atletaRepository = atletaRepository;
    }

    @Override
    public AtletaEntity save(AtletaEntity atletaEntity) {
        return atletaRepository.save(atletaEntity);
    }

    @Override
    public AtletaEntity update(Long id, AtletaEntity atletaEntity) {
        Optional<AtletaEntity> atletaExistente = atletaRepository.findById(id);
        if (atletaExistente.isPresent()) {
            return atletaRepository.save(atletaEntity);
        }
        System.out.println("Atleta não encontrado.");
        return null;
    }

    @Override
    public void delete(Long id) {
        if (atletaRepository.existsById(id)) {
            atletaRepository.deleteById(id);
            System.out.println("Atleta removido com sucesso.");
        } else {
            System.out.println("Atleta não encontrado.");
        }
    }

    @Override
    public List<AtletaEntity> findAll() {
        return atletaRepository.findAll();
    }

}

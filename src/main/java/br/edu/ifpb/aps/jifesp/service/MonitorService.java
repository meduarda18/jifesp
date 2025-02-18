package br.edu.ifpb.aps.jifesp.service;

import java.util.List;
import java.util.Optional;

import br.edu.ifpb.aps.jifesp.entity.AtletaEntity;
import br.edu.ifpb.aps.jifesp.entity.MonitorEntity;
import br.edu.ifpb.aps.jifesp.repository.AtletaRepository;
import br.edu.ifpb.aps.jifesp.repository.MonitorRepository;

public class MonitorService implements CrudService<MonitorEntity, Long> {

    private final MonitorRepository monitorRepository;

    public MonitorService(MonitorRepository monitorRepository){
        this.monitorRepository = monitorRepository;
    }

    @Override
    public MonitorEntity save(MonitorEntity monitorEntity) {
        return monitorRepository.save(monitorEntity);
    }

    @Override
    public MonitorEntity update(Long id, MonitorEntity monitorEntity) {
       Optional<MonitorEntity> monitorExistente = monitorRepository.findById(id);
        if (monitorExistente.isPresent()) {
            return monitorRepository.save(monitorEntity);
        }
        System.out.println("Monitor não encontrado.");
        return null;
    }

    @Override
    public void delete(Long id) {
        if (monitorRepository.existsById(id)) {
            monitorRepository.deleteById(id);
            System.out.println("Monitor removido com sucesso.");
        } else {
            System.out.println("Monitor não encontrado.");
        }
    }

    @Override
    public List<MonitorEntity> findAll() {
        return monitorRepository.findAll();
    }
    
}

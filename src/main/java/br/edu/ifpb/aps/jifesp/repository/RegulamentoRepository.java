package br.edu.ifpb.aps.jifesp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifpb.aps.jifesp.entity.RegulamentoEntity;

@Repository
public interface RegulamentoRepository extends JpaRepository<RegulamentoEntity, Long>{
    
}

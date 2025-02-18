package br.edu.ifpb.aps.jifesp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.edu.ifpb.aps.jifesp.entity.JogoEntity;

@Repository
public interface JogoRepository extends JpaRepository<JogoEntity, Long> {

    
}
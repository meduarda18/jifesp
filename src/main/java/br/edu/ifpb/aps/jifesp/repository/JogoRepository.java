package br.edu.ifpb.aps.jifesp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifpb.aps.jifesp.entity.AtletaEntity;
import br.edu.ifpb.aps.jifesp.entity.JogoEntity;

@Repository
public interface JogoRepository extends JpaRepository<JogoEntity, Long> {
    Optional<JogoEntity> findByAtletasContains(AtletaEntity atleta);
    
}
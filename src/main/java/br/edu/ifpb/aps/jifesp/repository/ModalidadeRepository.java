package br.edu.ifpb.aps.jifesp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifpb.aps.jifesp.entity.ModalidadeEntity;


@Repository
public interface ModalidadeRepository extends JpaRepository<ModalidadeEntity, Long> {
}

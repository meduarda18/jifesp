
package br.edu.ifpb.aps.jifesp.service;

import br.edu.ifpb.aps.jifesp.entity.*;
import br.edu.ifpb.aps.jifesp.repository.AtletaRepository;
import br.edu.ifpb.aps.jifesp.repository.EquipeRepository;

import java.util.List;

public class InscricaoModalidadeService {

    private AtletaRepository atletarepository;
    private EquipeRepository equipeRepository;

    public void inscreveModalidade(AtletaEntity atleta, ModalidadeEntity modalidade) {
        if(atleta == null || modalidade == null){
            throw new IllegalArgumentException("Atleta e Modalidade devem ser informados");
        }
        if (atleta.getModalidades().contains(modalidade)) {
            throw new RuntimeException("Atleta já inscrito");
        }
        atleta.getModalidades().add(modalidade);
        atletarepository.save(atleta);
        
    }
/*
    public void inscreveEquipe(Long capitaoId, String nomeEquipe, List<AtletaEntity> participantes, Long modalidadeId) {
        
        


        
    }

    public List<ModalidadeEntity> buscaModalidade(AtletaEntity atleta) {
        // Retorna as modalidades em que o atleta está inscrito
        return atleta.getModalidades();
    }

    public JogoEntity buscarJogo(AtletaEntity atleta) {
        // Lógica para buscar o jogo associado ao atleta, se necessário
    }

    public RegulamentoEntity buscarRegulamento(ModalidadeEntity modalidade) {
        // Retorna o regulamento da modalidade
    }
*/
}


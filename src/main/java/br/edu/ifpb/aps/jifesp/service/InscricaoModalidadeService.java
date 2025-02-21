
package br.edu.ifpb.aps.jifesp.service;

import br.edu.ifpb.aps.jifesp.entity.*;

import java.util.List;

public class InscricaoModalidadeService {

    private AtletaRepository atletarepository;
    private ModalidadeRepository modalidaderepository;

    public void inscreveModalidade(AtletaEntity atleta, ModalidadeEntity modalidade) {
        if(atleta == null || modalidade == null){

        }
        
    }

    public void inscreveEquipe(AtletaEntity atleta, EquipeEntity equipe) {
        // Inscreve o atleta em uma equipe, similar à inscrição em modalidade
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

}


package br.edu.ifpb.aps.jifesp.service;

import java.util.*;

import br.edu.ifpb.aps.jifesp.entity.*;
import org.springframework.stereotype.Service;
import br.edu.ifpb.aps.jifesp.repository.CampeonatoRepository;

@Service
public class CampeonatoService implements CrudService <CampeonatoEntity, Long> {

    private final CampeonatoRepository campeonatoRepository;
    private JogoService jogoService;


    public CampeonatoService(CampeonatoRepository campeonatoRepository, JogoService jogoService){
        this.campeonatoRepository = campeonatoRepository;
        this.jogoService = jogoService;
    }

    @Override
    public CampeonatoEntity save(CampeonatoEntity campeonatoEntity) {
        return campeonatoRepository.save(campeonatoEntity);
    }

    @Override
    public CampeonatoEntity update(Long id, CampeonatoEntity campeonatoEntity) {
         Optional<CampeonatoEntity> campeonatoExistente = campeonatoRepository.findById(id);
        if (campeonatoExistente.isPresent()) {
            return campeonatoRepository.save(campeonatoEntity);
        }
        System.out.println("Campeonato não encontrado.");
        return null;
    }

    @Override
    public void delete(Long id) { 
        if (campeonatoRepository.existsById(id)) {
        campeonatoRepository.deleteById(id);
        System.out.println("Campeonato removido com sucesso.");
    } else {
        System.out.println("Campeonato não encontrado.");
    }
    }

    @Override
    public List<CampeonatoEntity> findAll() {
        return campeonatoRepository.findAll();
    }

    public void sortearChaves(ModalidadeEntity modalidade) {
        List<?> competidores;

        if (modalidade.isColetiva()) {
            competidores = modalidade.getEquipes(); // Sorteia entre equipes
        } else {
            competidores = modalidade.getAtletas(); // Sorteia entre atletas individuais
        }

        if (competidores.size() < 2) {
            System.out.println("Não há competidores suficientes para sortear chaves.");
            return;
        }

        Collections.shuffle(competidores); // Embaralha os competidores

        if(modalidade.isColetiva()){
            for(int i = 0; i < competidores.size(); i += 2){
                if(i + 1 < competidores.size()){
                    EquipeEntity equipe1 = (EquipeEntity) competidores.get(i);
                    EquipeEntity equipe2 = (EquipeEntity) competidores.get(i + 1);

                    JogoEntity jogo = new JogoEntity(new ArrayList<>(), Arrays.asList(equipe1, equipe2), 0);
                    jogoService.save(jogo);
                }
            }
        } else {
            for(int i = 0; i < competidores.size(); i += 2){
                if(i + 1 < competidores.size()){
                    AtletaEntity atleta1 = (AtletaEntity) competidores.get(i);
                    AtletaEntity atleta2 = (AtletaEntity) competidores.get(i + 1);

                    JogoEntity jogo = new JogoEntity(Arrays.asList(atleta1, atleta2), new ArrayList<>(), 0);
                    jogoService.save(jogo);
                }
            }
        }
    }

}

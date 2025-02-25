package br.edu.ifpb.aps.jifesp.controller;

import br.edu.ifpb.aps.jifesp.entity.CampeonatoEntity;
import br.edu.ifpb.aps.jifesp.service.CampeonatoService;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/campeonatos")
public class CampeonatoController {

    private final CampeonatoService  campeonatoService;

    public CampeonatoController(CampeonatoService campeonatoService){
        this.campeonatoService = campeonatoService;
    }

    @PostMapping
    public CampeonatoEntity salvarCampeonato(@RequestBody CampeonatoEntity campeonatoEntity) {
        return campeonatoService.save(campeonatoEntity);
    }

    @PutMapping("/{id}")
    public CampeonatoEntity atualizarCampeonato(@PathVariable Long id, @RequestBody CampeonatoEntity campeonatoEntity) {
        return campeonatoService.update(id, campeonatoEntity);
    }

    @DeleteMapping("/{id}")
    public void deletarCampeonato(@PathVariable Long id) {
        campeonatoService.delete(id);
    }

    @GetMapping
    public List<CampeonatoEntity> listarCampeonatos() {
        return campeonatoService.findAll();
    }
}

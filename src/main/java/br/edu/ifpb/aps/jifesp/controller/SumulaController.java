package br.edu.ifpb.aps.jifesp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.edu.ifpb.aps.jifesp.entity.SumulaEntity;
import br.edu.ifpb.aps.jifesp.service.SumulaService;

public class SumulaController {
    
    private final SumulaService sumulaService;

    public SumulaController(SumulaService sumulaService) {
        this.sumulaService = sumulaService;
    }

    @PostMapping
    public SumulaEntity salvarSumula(@RequestBody SumulaEntity sumulaEntity) {
        return sumulaService.save(sumulaEntity);
    }

    @PutMapping("/{id}")
    public SumulaEntity atualizarSumula(@PathVariable Long id, @RequestBody SumulaEntity sumulaEntity) {
        return sumulaService.update(id, sumulaEntity);
    }

    @DeleteMapping("/{id}")
    public void deletarSumula(@PathVariable Long id) {
        sumulaService.delete(id);
    }

    @GetMapping
    public List<SumulaEntity> listarSumulas() {
        return sumulaService.findAll();
    }

}

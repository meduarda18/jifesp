package br.edu.ifpb.aps.jifesp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifpb.aps.jifesp.entity.AtletaEntity;
import br.edu.ifpb.aps.jifesp.entity.RegulamentoEntity;
import br.edu.ifpb.aps.jifesp.service.AtletaService;
import br.edu.ifpb.aps.jifesp.service.RegulamentoService;

@RestController
@RequestMapping("/regulamentos")
public class RegulamentoController {
    private final RegulamentoService regulamentoService;

    public RegulamentoController(RegulamentoService regulamentoService) {
        this.regulamentoService = regulamentoService;
    }

    @PostMapping
    public RegulamentoEntity salvarRegulamento(@RequestBody RegulamentoEntity regulamentoEntity) {
        return regulamentoService.save(regulamentoEntity);
    }

    @PutMapping("/{id}")
    public RegulamentoEntity atualizarRegulamento(@PathVariable Long id,
            @RequestBody RegulamentoEntity regulamentoEntity) {
        return regulamentoService.update(id, regulamentoEntity);
    }

    @DeleteMapping("/{id}")
    public void deletarRegulamento(@PathVariable Long id) {
        regulamentoService.delete(id);
    }

    @GetMapping
    public List<RegulamentoEntity> listarRegulamentos() {
        return regulamentoService.findAll();
    }
}

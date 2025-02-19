package br.edu.ifpb.aps.jifesp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.edu.ifpb.aps.jifesp.entity.ProfessorEntity;
import br.edu.ifpb.aps.jifesp.service.ProfessorService;

public class ProfessorController {
    private final ProfessorService professorService;

    public ProfessorController(ProfessorService professorService) {
        this.professorService = professorService;
    }

    @PostMapping
    public ProfessorEntity salvarProfessor(@RequestBody ProfessorEntity professorEntity) {
        return professorService.save(professorEntity);
    }

    @PutMapping("/{id}")
    public ProfessorEntity atualizarProfessor(@PathVariable Long id, @RequestBody ProfessorEntity professorEntity) {
        return professorService.update(id, professorEntity);
    }

    @DeleteMapping("/{id}")
    public void deletarProfessor(@PathVariable Long id) {
        professorService.delete(id);
    }

    @GetMapping
    public List<ProfessorEntity> listarProfessores() {
        return professorService.findAll();
    }

}

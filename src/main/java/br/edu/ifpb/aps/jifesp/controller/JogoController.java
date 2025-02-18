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


import br.edu.ifpb.aps.jifesp.entity.JogoEntity;
import br.edu.ifpb.aps.jifesp.service.JogoService;

@RestController
@RequestMapping("/jogos")
public class JogoController {

    private final JogoService jogoService;

    public JogoController(JogoService jogoService){
        this.jogoService = jogoService;
    }

    @PostMapping
    public JogoEntity salvarJogo(@RequestBody JogoEntity jogoEntity) {
        return jogoService.save(jogoEntity);
    }

    @PutMapping("/{id}")
    public JogoEntity atualizarJogo(@PathVariable Long id, @RequestBody JogoEntity jogoEntity) {
        return jogoService.update(id, jogoEntity);
    }

    @DeleteMapping("/{id}")
    public void deletarJogo(@PathVariable Long id) {
        jogoService.delete(id);
    }

    @GetMapping
    public List<JogoEntity> listarJogos() {
        return jogoService.findAll();
    }
    
}

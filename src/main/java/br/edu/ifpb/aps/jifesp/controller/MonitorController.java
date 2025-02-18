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

import br.edu.ifpb.aps.jifesp.entity.MonitorEntity;
import br.edu.ifpb.aps.jifesp.service.MonitorService;

@RestController
@RequestMapping("/monitores")
public class MonitorController {
    private final MonitorService monitorService;

    public MonitorController(MonitorService monitorService) {
        this.monitorService = monitorService;
    }

    @PostMapping
    public MonitorEntity salvarMonitor(@RequestBody MonitorEntity monitorEntity) {
        return monitorService.save(monitorEntity);
    }

    @PutMapping("/{id}")
    public MonitorEntity atualizarMonitor(@PathVariable Long id, @RequestBody MonitorEntity monitorEntity) {
        return monitorService.update(id, monitorEntity);
    }

    @DeleteMapping("/{id}")
    public void deletarMonitor(@PathVariable Long id) {
        monitorService.delete(id);
    }

    @GetMapping
    public List<MonitorEntity> listarMonitores() {
        return monitorService.findAll();
    }

}

package com.monitoria.LTP.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.monitoria.LTP.model.Monitor;
import com.monitoria.LTP.repository.MonitorRepository;

@RestController
@CrossOrigin
public class MonitorController {
    @Autowired
    MonitorRepository monitorRepository;

    @GetMapping("/monitoria")
    public List<Monitor> getMonitores(){
        return (List<Monitor>) monitorRepository.findAll();
    }

    @DeleteMapping("/monitor/deletar/{id_monitor}")
    public void deleteMonitores(@PathVariable ("id_monitor") Long id){
        monitorRepository.deleteById(id);
    }

    @PutMapping("/monitor/{id_monitor}")
    public Monitor atualizarHorarios(@PathVariable ("id_monitor") Long id,@RequestBody Monitor dadosMonitor){
        Monitor monitor = monitorRepository.findById(id).get();
        monitor.setHorarios(dadosMonitor.getHorarios());

        return monitor;
    }
}

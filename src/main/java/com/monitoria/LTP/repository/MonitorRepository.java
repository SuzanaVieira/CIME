package com.monitoria.LTP.repository;

import org.springframework.data.repository.CrudRepository;

import com.monitoria.LTP.model.Monitor;

public interface MonitorRepository extends CrudRepository<Monitor, Long>{
    
}

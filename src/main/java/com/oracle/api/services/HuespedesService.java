package com.oracle.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.oracle.api.entities.Huespedes;
import com.oracle.api.repositories.HuespedesRepository;
/**
 *
 * @author JORGE DOMINGUEZ
 */

@Service
public class HuespedesService{
    
    @Autowired
    private final HuespedesRepository repository;
    
    public HuespedesService(HuespedesRepository r){
        this.repository = r;
    }
            
    public Huespedes HuespedesGuardar(Huespedes h){
      return repository.save(h);
    }
    
}
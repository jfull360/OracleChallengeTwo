package com.oracle.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.oracle.api.entities.Huespedes;
import com.oracle.api.repositories.HuespedesRepository;
import java.util.List;
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
    
    public List<Huespedes> searchHuespedesBynombre(String h){
      return repository.searchHuespedesBynombre(h);
    }
    
    public List<Huespedes> searchHuespedesByApellido(String h){
      return repository.searchHuespedesByApellido(h);
    }
    
}
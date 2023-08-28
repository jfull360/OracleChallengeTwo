package com.oracle.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.oracle.api.entities.Reservas;
import com.oracle.api.repositories.ReservasRepository;
import java.util.Optional;
/**
 *
 * @author JORGE DOMINGUEZ
 */

@Service
public class ReservasService{
    
    @Autowired
    private final ReservasRepository repository;
    
    public ReservasService(ReservasRepository r){
        this.repository = r;
    }
            
    public Reservas ReservasGuardar(Reservas h){
      return repository.save(h);
    }
    
    public Optional<Reservas> ReservasByID(Long id){
      return repository.findById(id);
    }
    
}
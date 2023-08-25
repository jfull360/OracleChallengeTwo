package com.oracle.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.oracle.api.entities.Reservas;
import com.oracle.api.repositories.ReservasRepository;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import com.oracle.api.repositories.LoginRepository;
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
    
}
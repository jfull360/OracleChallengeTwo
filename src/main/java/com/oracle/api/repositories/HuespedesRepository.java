package com.oracle.api.repositories;


import com.oracle.api.entities.Huespedes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author JORGE DOMINGUEZ
 */
@Repository
public interface HuespedesRepository extends JpaRepository<Huespedes,Long>{
    
    
    //@Query(value = "SELECT c FROM")
    //Reservas getAll();

}
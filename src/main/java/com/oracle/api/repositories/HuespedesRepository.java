package com.oracle.api.repositories;


import com.oracle.api.entities.Huespedes;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author JORGE DOMINGUEZ
 */
@Repository
public interface HuespedesRepository extends JpaRepository<Huespedes,Long>{
    
    @Query(value = "SELECT h FROM Huespedes h WHERE h.nombre = :nombre ")
    List<Huespedes> searchHuespedesBynombre(@Param("nombre") String nombre);
    
    @Query(value = "SELECT h FROM Huespedes h WHERE h.apellido = :apellido")
    List<Huespedes> searchHuespedesByApellido(@Param("apellido") String apellido);

}
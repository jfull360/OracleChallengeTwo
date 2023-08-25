/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.oracle.api.repositories;

import com.oracle.api.entities.Reservas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author JORGE DOMINGUEZ
 */
@Repository
public interface ReservasRepository extends JpaRepository<Reservas,Long>{
    
}
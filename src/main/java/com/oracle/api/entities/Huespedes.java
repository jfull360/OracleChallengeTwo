/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oracle.api.entities;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.List;
import lombok.Data;


@Entity
@Table(name = "huespedes")
@Data
public class Huespedes implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idhuespedes")
    private Integer idhuespedes;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "fecha_nacimiento", columnDefinition = "VARCHAR(100)")
    private String fechaNacimiento;
    @Column(name = "nacionalidad")
    private String nacionalidad;
    @Column(name = "telefono")
    private String telefono;
    //@JoinColumn(name = "id_reserva", referencedColumnName = "id")
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "id")
    private List<Reservas> idReserva;

}
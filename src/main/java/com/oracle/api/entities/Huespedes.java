/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oracle.api.entities;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;


@Entity
@Table(name = "huespedes")
public class Huespedes implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idhuespedes")
    private Long idhuespedes;
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
    @JoinColumn(name = "idReserva", referencedColumnName = "id")
    private Reservas idReserva;

    public Huespedes(){}
    
    public Huespedes(Long idhuespedes, String nombre, String apellido, String fechaNacimiento, String nacionalidad, String telefono, Reservas idReserva) {
        this.idhuespedes = idhuespedes;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
        this.telefono = telefono;
        this.idReserva = idReserva;
    }

    
    public Long getIdhuespedes() {
        return idhuespedes;
    }

    public void setIdhuespedes(Long idhuespedes) {
        this.idhuespedes = idhuespedes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Reservas getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Reservas idReserva) {
        this.idReserva = idReserva;
    }
    
    
    
}
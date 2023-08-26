package com.oracle.api.entities;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

/**
 *
 * @author JORGE DOMINGUEZ
 */
@Entity
@Table(name = "huespedes", catalog = "hotel", schema = "")
@NamedQueries({
    @NamedQuery(name = "Huespedes.findAll", query = "SELECT h FROM Huespedes h"),
    @NamedQuery(name = "Huespedes.findByIdhuespedes", query = "SELECT h FROM Huespedes h WHERE h.idhuespedes = :idhuespedes"),
    @NamedQuery(name = "Huespedes.findByNombre", query = "SELECT h FROM Huespedes h WHERE h.nombre = :nombre"),
    @NamedQuery(name = "Huespedes.findByApellido", query = "SELECT h FROM Huespedes h WHERE h.apellido = :apellido"),
    @NamedQuery(name = "Huespedes.findByFechaNacimiento", query = "SELECT h FROM Huespedes h WHERE h.fechaNacimiento = :fechaNacimiento"),
    @NamedQuery(name = "Huespedes.findByNacionalidad", query = "SELECT h FROM Huespedes h WHERE h.nacionalidad = :nacionalidad"),
    @NamedQuery(name = "Huespedes.findByTelefono", query = "SELECT h FROM Huespedes h WHERE h.telefono = :telefono")})
public class Huespedes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idhuespedes")
    private Long idhuespedes;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "apellido")
    private String apellido;
    @Basic(optional = false)
    @Column(name = "fecha_nacimiento")
    private String fechaNacimiento;
    @Basic(optional = false)
    @Column(name = "nacionalidad")
    private String nacionalidad;
    @Basic(optional = false)
    @Column(name = "telefono")
    private String telefono;
    @JoinColumn(name = "id_reserva", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Reservas idReserva;

    public Huespedes() {
    }

    public Huespedes(Long idhuespedes) {
        this.idhuespedes = idhuespedes;
    }

    public Huespedes(Long idhuespedes, String nombre, String apellido, String fechaNacimiento, String nacionalidad, String telefono) {
        this.idhuespedes = idhuespedes;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
        this.telefono = telefono;
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

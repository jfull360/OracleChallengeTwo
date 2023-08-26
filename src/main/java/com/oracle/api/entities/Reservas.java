package com.oracle.api.entities;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

/**
 *
 * @author JORGE DOMINGUEZ
 */
@Entity
@Table(name = "reservas", catalog = "hotel", schema = "")
@NamedQueries({
    @NamedQuery(name = "Reservas.findAll", query = "SELECT r FROM Reservas r"),
    @NamedQuery(name = "Reservas.findById", query = "SELECT r FROM Reservas r WHERE r.id = :id"),
    @NamedQuery(name = "Reservas.findByFechaEntrada", query = "SELECT r FROM Reservas r WHERE r.fechaEntrada = :fechaEntrada"),
    @NamedQuery(name = "Reservas.findByFechaSalida", query = "SELECT r FROM Reservas r WHERE r.fechaSalida = :fechaSalida"),
    @NamedQuery(name = "Reservas.findByValor", query = "SELECT r FROM Reservas r WHERE r.valor = :valor"),
    @NamedQuery(name = "Reservas.findByFormaPago", query = "SELECT r FROM Reservas r WHERE r.formaPago = :formaPago")})
@Data
public class Reservas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "fecha_entrada")
    private String fechaEntrada;
    @Basic(optional = false)
    @Column(name = "fecha_salida")
    private String fechaSalida;
    @Basic(optional = false)
    @Column(name = "valor")
    private String valor;
    @Basic(optional = false)
    @Column(name = "forma_pago")
    private String formaPago;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idReserva")
    private List<Huespedes> huespedesList;

}

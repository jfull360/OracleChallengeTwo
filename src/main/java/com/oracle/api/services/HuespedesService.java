package com.oracle.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.oracle.api.entities.Huespedes;
import com.oracle.api.entities.Reservas;
import com.oracle.api.repositories.HuespedesRepository;
import com.oracle.api.repositories.ReservasRepository;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author JORGE DOMINGUEZ
 */
@Service
public class HuespedesService {

    @Autowired
    private final HuespedesRepository repository;
    @Autowired
    private final ReservasRepository reservasrepo;

    public HuespedesService(HuespedesRepository r, ReservasRepository re) {
        this.repository = r;
        this.reservasrepo = re;
    }

    public Huespedes HuespedesGuardar(Huespedes h) {
        return repository.save(h);
    }

    public List<Huespedes> searchHuespedesBynombre(String h) {
        return repository.searchHuespedesBynombre(h);
    }

    public Optional<Huespedes> searchHuespedesByID(Long id) {
        return repository.findById(id);
    }

    public List<Huespedes> searchHuespedesByApellido(String h) {
        return repository.searchHuespedesByApellido(h);
    }

    public boolean saveListHuespedes(List<Huespedes> h) {
        List<Huespedes> list = repository.saveAll(h);
        return !list.isEmpty();
    }

    public Optional<Huespedes> getReserva(Long id) {
        return repository.findById(id);
    }

    public Optional<Reservas> huespedHasReservas(Long idHuesped) {
        Optional<Huespedes> aux = repository.findById(idHuesped);
        return reservasrepo.findById(aux.get().getIdReserva().getId());
    }

    public void deleteHuesped(Long id) {
        repository.deleteById(id);
    }
}

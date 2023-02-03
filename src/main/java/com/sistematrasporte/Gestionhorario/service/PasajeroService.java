package com.sistematrasporte.Gestionhorario.service;

import com.sistematrasporte.Gestionhorario.models.Bus;
import com.sistematrasporte.Gestionhorario.models.Pasajero;
import com.sistematrasporte.Gestionhorario.repository.PasajeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PasajeroService implements IPasajeroService {

    @Autowired
    private PasajeroRepository pasajeroRepository;

    @Override
    public List<Pasajero> obtenerPasajero() {
        return pasajeroRepository.getPasajero();
    }

    @Override
    public void registrarPasajero(Pasajero pasajero) {
        pasajeroRepository.registrarPasajero(pasajero);
    }

    @Override
    public void eliminarPasajero(String id) {
        pasajeroRepository.eliminarPasajero(id);
    }

    @Override
    public void actualizarPasajero(Pasajero pasajero) {
       pasajeroRepository.actualizarPasajero(pasajero);
    }


}

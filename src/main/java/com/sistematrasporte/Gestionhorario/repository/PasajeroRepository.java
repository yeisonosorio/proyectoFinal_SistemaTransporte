package com.sistematrasporte.Gestionhorario.repository;

import com.sistematrasporte.Gestionhorario.models.Pasajero;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class PasajeroRepository {

    List<Pasajero> pasajeros;


    public void registrarPasajero(Pasajero pasajero) {
        pasajeros.add(pasajero);
    }

    public PasajeroRepository() {
        this.pasajeros = new ArrayList<>();
    }

    public List<Pasajero> getPasajero() {
        return pasajeros;
    }

    public List<Pasajero> obtenerPasajeros() {
        return pasajeros;
    }

    public void eliminarPasajero(String id) {
        pasajeros = pasajeros.stream().filter(pasajero -> !pasajero.getId().equals(id))
                .collect(Collectors.toList());
    }

    public void actualizarPasajero(Pasajero pasajero) {
        pasajeros = pasajeros.stream().map(p -> {
            if (p.getId().equals(pasajero.getId())) {
                return pasajero;
            }
            return p;
        }).collect(Collectors.toList());
    }
}

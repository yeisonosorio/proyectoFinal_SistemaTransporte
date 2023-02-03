package com.sistematrasporte.Gestionhorario.repository;

import com.sistematrasporte.Gestionhorario.models.Bus;
import com.sistematrasporte.Gestionhorario.models.Pasajero;
import com.sistematrasporte.Gestionhorario.models.Persona;

import java.util.List;
import java.util.stream.Collectors;

public class PasajeroRepository {


    List<Pasajero> pasajeros;


    public void registrarPasajero(Pasajero pasajero) {
        pasajeros.add(pasajero);
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

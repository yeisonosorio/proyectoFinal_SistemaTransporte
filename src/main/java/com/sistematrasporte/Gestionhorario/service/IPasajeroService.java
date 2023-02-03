package com.sistematrasporte.Gestionhorario.service;

import com.sistematrasporte.Gestionhorario.models.Bus;
import com.sistematrasporte.Gestionhorario.models.Pasajero;

import java.util.List;

public interface IPasajeroService {

    List<Pasajero> obtenerPasajero();

    void registrarPasajero(Pasajero pasajero);

    void eliminarPasajero(String id);

    default void actualizarPasajero(Pasajero pasajero) {}



}

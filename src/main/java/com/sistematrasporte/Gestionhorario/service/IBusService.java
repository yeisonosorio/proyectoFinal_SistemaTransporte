package com.sistematrasporte.Gestionhorario.service;

import com.sistematrasporte.Gestionhorario.models.Bus;

import java.util.List;

public interface IBusService {

    List<Bus> obtenerBuses();

    void registrarBus(Bus bus);

    void eliminarBus(String id);

    default void actualizarBus(Bus bus){}

    Bus obtenerBusId(String id);
}

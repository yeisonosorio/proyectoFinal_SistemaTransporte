package com.sistematrasporte.Gestionhorario.service;

import com.sistematrasporte.Gestionhorario.models.Bus;
import com.sistematrasporte.Gestionhorario.models.Destino;
import com.sistematrasporte.Gestionhorario.models.RegistroViaje;

import java.util.List;

public interface ITerminalTransporteService {

    void registrarDestino(Destino destino);
    void registrarBus(Bus bus);
    void registrarViaje(RegistroViaje registro);
    List<Destino> getDestinos();
    List<Bus> getBuses();
    List<RegistroViaje> getRegistroViajes();
}

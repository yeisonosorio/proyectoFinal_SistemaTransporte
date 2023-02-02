package com.sistematrasporte.Gestionhorario.repository;

import com.sistematrasporte.Gestionhorario.models.Bus;
import com.sistematrasporte.Gestionhorario.models.Destino;
import com.sistematrasporte.Gestionhorario.models.RegistroViaje;
import com.sistematrasporte.Gestionhorario.models.TerminalTransporte;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TerminalTransporteRepository {

    private List<Destino> destinos;
    private List<Bus> buses;
    private List<RegistroViaje> registroViajes;


    public List<Destino> obtenerDestinos() {
        return this.obtenerDestinos();
    }

    public List<Bus> obtenerBuses() {
        return obtenerBuses();
    }

    public List<RegistroViaje> obtenerRegistroViajes() {
        return obtenerRegistroViajes();
    }


    public void registrarDestino(Destino destino) {
        destinos.add(destino);

    }

    public void registrarBus(Bus bus) {
        buses.add(bus);
    }

    public void registrarViaje(RegistroViaje registro) {
        registroViajes.add(registro);

    }


}

package com.sistematrasporte.Gestionhorario.service;


import com.sistematrasporte.Gestionhorario.models.Bus;
import com.sistematrasporte.Gestionhorario.models.Destino;
import com.sistematrasporte.Gestionhorario.models.RegistroViaje;
import com.sistematrasporte.Gestionhorario.repository.TerminalTransporteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TerminalTransporteService implements ITerminalTransporteService {

    @Autowired
    private TerminalTransporteRepository terminalTransporteRepository;

    @Override
    public void registrarDestino(Destino destino) {

    }

    @Override
    public void registrarBus(Bus bus) {

    }

    @Override
    public void registrarViaje(RegistroViaje registro) {

    }

    @Override
    public List<Destino> getDestinos() {
        return null;
    }

    @Override
    public List<Bus> getBuses() {
        return null;
    }

    @Override
    public List<RegistroViaje> getRegistroViajes() {
        return null;
    }
}

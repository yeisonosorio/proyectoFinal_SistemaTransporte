package com.sistematrasporte.Gestionhorario.service;


import com.sistematrasporte.Gestionhorario.models.Bus;
import com.sistematrasporte.Gestionhorario.models.Destino;
import com.sistematrasporte.Gestionhorario.models.RegistroViaje;
import com.sistematrasporte.Gestionhorario.repository.BusRepository;
import com.sistematrasporte.Gestionhorario.repository.RegistroViajeRepository;
import com.sistematrasporte.Gestionhorario.repository.TerminalTransporteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TerminalTransporteService implements ITerminalTransporteService {

    @Autowired
    private TerminalTransporteRepository terminalTransporteRepository;

    @Autowired
    private BusRepository busRepository;

    @Autowired
    private RegistroViajeRepository registroViajeRepository;

    @Override
    public void registrarDestino(Destino destino) {
        terminalTransporteRepository.registrarDestino(destino);
    }

}

package com.sistematrasporte.Gestionhorario.service;


import com.sistematrasporte.Gestionhorario.models.Bus;
import com.sistematrasporte.Gestionhorario.repository.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusService implements IBusService {

    @Autowired
    private BusRepository busRepository;


    @Override
    public List<Bus> obtenerBuses() {
        return null;
    }

    @Override
    public void registrarBus(Bus bus) {

    }

    @Override
    public void modificarBus(Bus bus) {

    }

    @Override
    public void eliminarBus(String idBus) {

    }
}

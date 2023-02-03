package com.sistematrasporte.Gestionhorario.service;


import com.sistematrasporte.Gestionhorario.models.Bus;
import com.sistematrasporte.Gestionhorario.repository.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BusService implements IBusService {

    @Autowired
    private BusRepository busRepository;


    @Override
    public List<Bus> obtenerBuses() {
        return busRepository.getBuses();
    }

    @Override
    public void registrarBus(Bus bus) {
        busRepository.registrarBus(bus);
    }


    @Override
    public void eliminarBus(String id) {
        busRepository.eliminarBus(id);
    }

    @Override
    public void actualizarBus(Bus bus) {
        busRepository.actualizarBus(bus);
    }

    @Override
    public Bus obtenerBusId(String id) {
        return busRepository.obtenerBusId(id);
    }


}

package com.sistematrasporte.Gestionhorario.repository;


import com.sistematrasporte.Gestionhorario.models.Bus;
import com.sistematrasporte.Gestionhorario.models.RegistroViaje;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class BusRepository {

    private List<Bus> buses;


    public BusRepository(List<Bus> buses) {
        this.buses = new ArrayList<>();
    }

    public void registrarBus(Bus bus)
    {
        buses.add(bus);
    }

    public void eliminarBus(String id) {
        buses = buses.stream().filter(bus -> !bus.getId().equals(id))
                .collect(Collectors.toList());
    }

    public List<Bus> getBuses() {
        return buses;
    }


    public void actualizarBus(Bus bus) {
        buses = buses.stream().map(p -> {
            if (p.getId().equals(bus.getId())) {
                return bus;
            }
            return p;
        }).collect(Collectors.toList());
    }


    public Bus obtenerBusId(String id) {
        return buses.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

}

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

    public void registrarBus(Bus bus) {
        buses.add(bus);
    }

    public void eliminarBus(String id) {
        List<Bus> newLists = this.buses.stream()
                .filter(bus -> !bus.getId().equals(id))
                .collect(Collectors.toList());
        this.buses = newLists;
    }

    public List<Bus> getBuses() {
        return buses;
    }

    /**
     * pendiente de modificar
     *
     * @param bus
     */
    public void actualizarBus(Bus bus) {
        List<Bus> buses = this.getBuses();
        int index = buses.indexOf(bus);
        if (index != -1) {
            buses.set(index, bus);
        }
    }

}

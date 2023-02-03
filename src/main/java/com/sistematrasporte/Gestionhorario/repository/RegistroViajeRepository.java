package com.sistematrasporte.Gestionhorario.repository;

import com.sistematrasporte.Gestionhorario.models.Pasajero;
import com.sistematrasporte.Gestionhorario.models.RegistroViaje;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Repository
public class RegistroViajeRepository {


    private List<RegistroViaje> registroViajes;

    public RegistroViajeRepository() {
        this.registroViajes = new ArrayList<>();
    }

    public List<RegistroViaje> obtenerRegistroViajes() {
        return this.registroViajes;
    }

    public List<RegistroViaje> getRegistroViajes() {
        return registroViajes;
    }

    public void registrarViaje(RegistroViaje registroViaje) {
        registroViajes.add(registroViaje);
    }

    public void eliminarViaje(String id) {
        registroViajes = registroViajes.stream().filter(viaje -> !viaje.getId().equals(id))
                .collect(Collectors.toList());
    }

    public void actualizarRegistroViaje(RegistroViaje registroViaje) {
        registroViajes = registroViajes.stream()
                .map(r -> r.getId().equals(r.getId()) ? registroViaje : r)
                .collect(Collectors.toList());
    }
}



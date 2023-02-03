package com.sistematrasporte.Gestionhorario.repository;

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

    public void registrarViaje(RegistroViaje registroViaje) {
        registroViajes.add(registroViaje);
    }

    public void eliminarViaje(String id) {
        registroViajes.remove(id);
    }

    public void actualizarRegistroViaje(RegistroViaje registroViaje) {
        registroViajes = registroViajes.stream()
                .map(r -> r.getId().equals(r.getId()) ? registroViaje : r)
                .collect(Collectors.toList());
    }
}



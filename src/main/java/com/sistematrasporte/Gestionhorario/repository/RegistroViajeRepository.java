package com.sistematrasporte.Gestionhorario.repository;

import com.sistematrasporte.Gestionhorario.models.RegistroViaje;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


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

    public void eliminarViaje(RegistroViaje registroViaje) {
        registroViajes.remove(registroViaje);
    }

    public void actualizarRegistroViaje(RegistroViaje viaje) {

    }

}

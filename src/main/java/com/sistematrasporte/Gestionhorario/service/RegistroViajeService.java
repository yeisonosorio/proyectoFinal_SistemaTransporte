package com.sistematrasporte.Gestionhorario.service;


import com.sistematrasporte.Gestionhorario.models.Bus;
import com.sistematrasporte.Gestionhorario.models.RegistroViaje;
import com.sistematrasporte.Gestionhorario.repository.RegistroViajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistroViajeService implements IRegistroViajeService {

    @Autowired
    private RegistroViajeRepository registroViajeRepository;


    @Override
    public void registrarViaje(RegistroViaje viaje) {
        registroViajeRepository.registrarViaje(viaje);
    }

    @Override
    public List<RegistroViaje> obtenerTodosLosViajes() {
        return registroViajeRepository.obtenerRegistroViajes();
    }


    @Override
    public void actualizarRegistroViaje(RegistroViaje registroViaje) {
        registroViajeRepository.actualizarRegistroViaje(registroViaje);
    }

    @Override
    public void eliminarRegistroViaje(String id) {
        registroViajeRepository.eliminarViaje(id);
    }

    @Override
    public Bus obtenerRegistroViajeId(String id) {
        return obtenerRegistroViajeId(id);
    }
}

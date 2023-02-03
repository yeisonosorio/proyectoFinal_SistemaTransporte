package com.sistematrasporte.Gestionhorario.service;

import com.sistematrasporte.Gestionhorario.models.Bus;
import com.sistematrasporte.Gestionhorario.models.RegistroViaje;

import java.util.List;

public interface IRegistroViajeService {

    void registrarViaje(RegistroViaje viaje);

    List<RegistroViaje> obtenerTodosLosViajes();


    void actualizarRegistroViaje(RegistroViaje viaje);


    void eliminarRegistroViaje(String id);

    Bus obtenerRegistroViajeId(String id);
}

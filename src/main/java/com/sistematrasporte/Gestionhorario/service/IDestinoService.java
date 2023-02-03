package com.sistematrasporte.Gestionhorario.service;

import com.sistematrasporte.Gestionhorario.models.Bus;
import com.sistematrasporte.Gestionhorario.models.Destino;
import com.sistematrasporte.Gestionhorario.models.RegistroViaje;

import java.util.List;

public interface IDestinoService {


    void registrarDestino(Destino destino);

    List<Destino> obtenerTodosLosDestinos();


    void actualizarDestino(Destino destino);


    void eliminarDestino(String id);


}

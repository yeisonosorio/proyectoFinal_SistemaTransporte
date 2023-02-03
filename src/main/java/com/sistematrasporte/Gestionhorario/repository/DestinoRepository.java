package com.sistematrasporte.Gestionhorario.repository;

import com.sistematrasporte.Gestionhorario.models.Destino;
import com.sistematrasporte.Gestionhorario.models.RegistroViaje;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DestinoRepository {

    private List<Destino> destinos;



    public List<Destino> obtenerDestinos() {
        return this.destinos;
    }

    public List<Destino> getDestinos() {
        return destinos;
    }

    public void registrarDestino(Destino destino) {
        destinos.add(destino);
    }

    public void eliminarViaje(String id) {
        destinos = destinos.stream().filter(viaje -> !viaje.getId().equals(id))
                .collect(Collectors.toList());
    }

    public void actualizarRegistroViaje(Destino destino) {
        destinos = destinos.stream()
                .map(r -> r.getId().equals(r.getId()) ? destino : r)
                .collect(Collectors.toList());
    }
}

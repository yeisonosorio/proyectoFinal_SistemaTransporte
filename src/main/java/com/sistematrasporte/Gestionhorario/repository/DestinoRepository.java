package com.sistematrasporte.Gestionhorario.repository;

import com.sistematrasporte.Gestionhorario.controller.DestinoController;
import com.sistematrasporte.Gestionhorario.models.Destino;
import com.sistematrasporte.Gestionhorario.models.RegistroViaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class DestinoRepository {


    private List<Destino> destinos;


    public List<Destino> getDestinos() {
        return getDestinos();
    }

    public void registrarDestino(Destino destino) {
        destinos.add(destino);
    }

    public void eliminarDestino(String id) {
        destinos = destinos.stream().filter(destino -> !destino.getId().equals(id))
                .collect(Collectors.toList());
    }

    public void actualizarDestino(Destino destino) {
        destinos = destinos.stream()
                .map(r -> r.getId().equals(r.getId()) ? destino : r)
                .collect(Collectors.toList());
    }
}

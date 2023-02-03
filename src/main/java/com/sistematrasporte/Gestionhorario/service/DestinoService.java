package com.sistematrasporte.Gestionhorario.service;

import com.sistematrasporte.Gestionhorario.models.Destino;
import com.sistematrasporte.Gestionhorario.models.RegistroViaje;
import com.sistematrasporte.Gestionhorario.repository.BusRepository;
import com.sistematrasporte.Gestionhorario.repository.DestinoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DestinoService implements IDestinoService {


    @Autowired
    private DestinoRepository destinoRepository;


    @Override
    public void registrarDestino(Destino destino) {
        destinoRepository.registrarDestino(destino);

    }

    @Override
    public List<Destino> obtenerTodosLosDestinos() {
        return destinoRepository.getDestinos();
    }

    @Override
    public void actualizarDestino(Destino destino) {
        destinoRepository.actualizarDestino(destino);

    }

    @Override
    public void eliminarDestino(String id) {
        destinoRepository.eliminarDestino(id);

    }
}

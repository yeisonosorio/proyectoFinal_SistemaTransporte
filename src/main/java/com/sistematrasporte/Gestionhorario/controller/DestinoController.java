package com.sistematrasporte.Gestionhorario.controller;

import com.sistematrasporte.Gestionhorario.models.Destino;
import com.sistematrasporte.Gestionhorario.models.Pasajero;
import com.sistematrasporte.Gestionhorario.repository.DestinoRepository;
import com.sistematrasporte.Gestionhorario.service.DestinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/destino")
public class DestinoController {

    @Autowired
    private DestinoService destinoService;


    @PostMapping
    public ResponseEntity<Destino> guardarDestino(@RequestBody Destino destino) {
        destinoService.actualizarDestino(destino);
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }

    @GetMapping("/list")
    public ResponseEntity obtenerDestinoList() {
        return new ResponseEntity(destinoService.obtenerTodosLosDestinos(), HttpStatus.FOUND);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarDestino(@PathVariable String id) {
        destinoService.eliminarDestino(id);
        return null;
    }

    @PutMapping("/actua")
    public ResponseEntity<Void> actualizarDestino(@RequestBody Destino destino) {
        destinoService.actualizarDestino(destino);
        return null;
    }

}

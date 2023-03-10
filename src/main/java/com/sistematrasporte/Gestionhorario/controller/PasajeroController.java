package com.sistematrasporte.Gestionhorario.controller;

import com.sistematrasporte.Gestionhorario.models.Pasajero;
import com.sistematrasporte.Gestionhorario.service.PasajeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pasajero")
public class PasajeroController {


    @Autowired
    private PasajeroService pasajeroService;

    public PasajeroController(PasajeroService pasajeroService) {
        this.pasajeroService = pasajeroService;
    }

    @PostMapping
    public ResponseEntity<Pasajero> guardarPasajero(@RequestBody Pasajero pasajero) {
        this.pasajeroService.registrarPasajero(pasajero);
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }

    @GetMapping("/list")
    public ResponseEntity obtenerPasajeroList() {
        return new ResponseEntity(pasajeroService.obtenerPasajero(), HttpStatus.FOUND);
    }


    @PutMapping("/actua")
    public ResponseEntity<Void> actualizarPasajero(@RequestBody Pasajero pasajero) {
        pasajeroService.actualizarPasajero(pasajero);
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarPasajero(@PathVariable String id) {
        pasajeroService.eliminarPasajero(id);
        return null;
    }
}

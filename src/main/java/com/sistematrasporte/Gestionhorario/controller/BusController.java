package com.sistematrasporte.Gestionhorario.controller;


import com.sistematrasporte.Gestionhorario.models.Bus;
import com.sistematrasporte.Gestionhorario.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RestController
@RequestMapping("/api")
public class BusController {

    @Autowired
    private BusService busService;

    public BusController(BusService busService) {
        this.busService = busService;
    }

    @PostMapping
    public ResponseEntity<Bus> guardar(@RequestBody Bus bus) {
        busService.registrarBus(bus);
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }

    @GetMapping("/list")
    public ResponseEntity obtenerBuses() {
        return new ResponseEntity(busService.obtenerBuses(), HttpStatus.FOUND);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarBus(@PathVariable String id) {
        busService.eliminarBus(id);
        return null;
    }

    @PutMapping("/actua")
    public ResponseEntity<Void> actualizarBus(@RequestBody Bus bus) {
        busService.actualizarBus(bus);
        return null;
    }

}

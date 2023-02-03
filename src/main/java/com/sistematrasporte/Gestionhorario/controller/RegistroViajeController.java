package com.sistematrasporte.Gestionhorario.controller;


import com.sistematrasporte.Gestionhorario.models.Bus;
import com.sistematrasporte.Gestionhorario.models.RegistroViaje;
import com.sistematrasporte.Gestionhorario.service.RegistroViajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/registro-viaje")
public class RegistroViajeController {


    @Autowired
    private RegistroViajeService registroViajeService;

    public RegistroViajeController(RegistroViajeService registroViajeService) {
        this.registroViajeService = registroViajeService;
    }

    @PostMapping
    public ResponseEntity<RegistroViaje> guardarViaje(@RequestBody RegistroViaje registroViaje) {
        registroViajeService.registrarViaje(registroViaje);
        return new ResponseEntity(HttpStatus.CREATED);
    }


    @PutMapping("/actua")
    public ResponseEntity<Void> actualizarViaje(@RequestBody RegistroViaje registroViaje) {
        registroViajeService.actualizarRegistroViaje(registroViaje);
        return null;
    }

    @GetMapping("/list")
    public ResponseEntity obtenerTodosLosViajes() {
        return new ResponseEntity(registroViajeService.obtenerTodosLosViajes(), HttpStatus.FOUND);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarBus(@PathVariable String id) {
        registroViajeService.eliminarRegistroViaje(id);
        return ResponseEntity.noContent().build();

    }


}

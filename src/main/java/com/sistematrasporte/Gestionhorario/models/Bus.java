package com.sistematrasporte.Gestionhorario.models;

import java.security.DrbgParameters;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Bus {

    private String id;
    private String placa;
    private String capacidad;


    public Bus(String id, String placa, String capacidad) {
        this.id = id;
        this.placa = placa;
        this.capacidad = capacidad;
    }

    public Bus() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bus bus = (Bus) o;
        return Objects.equals(id, bus.id) && Objects.equals(placa, bus.placa) && Objects.equals(capacidad, bus.capacidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, placa, capacidad);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "id='" + id + '\'' +
                ", placa='" + placa + '\'' +
                ", capacidad='" + capacidad + '\'' +
                '}';
    }
}

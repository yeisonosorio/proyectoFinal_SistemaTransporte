package com.sistematrasporte.Gestionhorario.models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class RegistroViaje {

    private String id;
    private Bus bus;
    private Destino destino;

    private LocalDate fecha;
    private LocalTime hora;

    private List<Pasajero> pasajeros;

    public RegistroViaje(String id, Bus bus, Destino destino, LocalDate fecha, LocalTime hora, List<Pasajero> pasajeros) {
        this.id = id;
        this.bus = bus;
        this.destino = destino;
        this.fecha = fecha;
        this.hora = hora;
        this.pasajeros = pasajeros;
    }

    public RegistroViaje() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public List<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(List<Pasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegistroViaje that = (RegistroViaje) o;
        return Objects.equals(id, that.id) && Objects.equals(bus, that.bus) && Objects.equals(destino, that.destino) && Objects.equals(fecha, that.fecha) && Objects.equals(hora, that.hora) && Objects.equals(pasajeros, that.pasajeros);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, bus, destino, fecha, hora, pasajeros);
    }


    @Override
    public String toString() {
        return "RegistroViaje{" +
                "id='" + id + '\'' +
                ", bus=" + bus +
                ", destino=" + destino +
                ", fecha=" + fecha +
                ", hora=" + hora +
                ", pasajeros=" + pasajeros +
                '}';
    }
}

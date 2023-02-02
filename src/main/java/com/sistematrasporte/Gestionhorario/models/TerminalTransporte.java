package com.sistematrasporte.Gestionhorario.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TerminalTransporte {

    private List<Destino> destinos;
    private List<Bus> buses;
    private List<RegistroViaje> registroViajes;

    public TerminalTransporte() {
        this.destinos = new ArrayList<Destino>();
        this.buses = new ArrayList<Bus>();
        this.registroViajes = new ArrayList<RegistroViaje>();
    }


    public void registrarDestino(Destino destino) {
        destinos.add(destino);
    }

    public void registrarBus(Bus bus) {
        buses.add(bus);
    }

    public void registrarViaje(RegistroViaje registro) {
        registroViajes.add(registro);
    }

    public List<Destino> getDestinos() {
        return destinos;
    }

    public void setDestinos(List<Destino> destinos) {
        this.destinos = destinos;
    }

    public List<Bus> getBuses() {
        return buses;
    }

    public void setBuses(List<Bus> buses) {
        this.buses = buses;
    }

    public List<RegistroViaje> getRegistroViajes() {
        return registroViajes;
    }

    public void setRegistroViajes(List<RegistroViaje> registroViajes) {
        this.registroViajes = registroViajes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TerminalTransporte that = (TerminalTransporte) o;
        return Objects.equals(destinos, that.destinos) && Objects.equals(buses, that.buses) && Objects.equals(registroViajes, that.registroViajes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destinos, buses, registroViajes);
    }


    @Override
    public String toString() {
        return "TerminalTransporte{" +
                "destinos=" + destinos +
                ", buses=" + buses +
                ", registroViajes=" + registroViajes +
                '}';
    }
}

package com.sistematrasporte.Gestionhorario.repository;


import com.sistematrasporte.Gestionhorario.models.Bus;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BusRepository {

    private List<Bus> buses;

    public BusRepository(List<Bus> buses) {
        this.buses = new ArrayList<>();
    }


}

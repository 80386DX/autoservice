package net.etwas.autoservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import net.etwas.autoservice.common.BodyType;
import net.etwas.autoservice.common.Fuel;

@Entity
public class Car {

    private Fuel fuel;
    private BodyType bodyType;
    private String licensePlate;
    private Integer km;
    @OneToOne
    private Customer customer;




}

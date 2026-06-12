package net.etwas.autoservice.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Fuel {

    P("Petrol"),
    D("Diesel");

    private final String fuelType;

}

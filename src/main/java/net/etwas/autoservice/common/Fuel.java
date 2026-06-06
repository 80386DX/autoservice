package net.etwas.autoservice.common;

public enum Fuel {

    P("Petrol"),
    D("Diesel");

    private final String fuelType;

    public String getFuelType() {
        return fuelType;
    }

    Fuel(String fuelType) {
        this.fuelType = fuelType;
    }
}

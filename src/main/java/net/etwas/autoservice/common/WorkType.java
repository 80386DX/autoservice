package net.etwas.autoservice.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum WorkType {

    MAINTENANCE("Regular maintenance"),
    ENGINE("Working on engine"),
    BRAKES("Brakes"),
    FUEL("Fuel job");

    private final String description;
}

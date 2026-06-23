package net.etwas.autoservice.dto;

import java.util.List;

public record EmployeeDTO(Long id,
                          String firstName,
                          String lastName,
                          String email) {
}

package net.etwas.autoservice.dto;

import java.time.LocalDateTime;

public record WorkDTO(Long id,
                      Long employeeId,
                      String employeeName,
                      Long carId,
                      String carBrand,
                      LocalDateTime workDate,
                      Double hoursSpent,
                      String description) {
}

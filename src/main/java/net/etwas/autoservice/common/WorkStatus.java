package net.etwas.autoservice.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum WorkStatus {

    IN_PROGRESS("Waiting", 200),
    REJECTED("Rejected", 403),
    OK("Approved", 201),
    DONE("Job done", 201);

    private final String status;
    private final int code;

}

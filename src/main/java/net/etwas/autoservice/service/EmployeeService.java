package net.etwas.autoservice.service;

import net.etwas.autoservice.dto.EmployeeDTO;
import net.etwas.autoservice.model.Employee;
import net.etwas.autoservice.repo.EmployeeRepo;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private final EmployeeRepo repo;

    public EmployeeService(EmployeeRepo employeeRepository) {
        this.repo = employeeRepository;
    }

    public EmployeeDTO getEmployeeDTO(Long id) {
        Employee employee = repo.findById(id)
                .orElseThrow();

        return new EmployeeDTO(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }

}

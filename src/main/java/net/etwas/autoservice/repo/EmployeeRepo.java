package net.etwas.autoservice.repo;

import net.etwas.autoservice.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {


}

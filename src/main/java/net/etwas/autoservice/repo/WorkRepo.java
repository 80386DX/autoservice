package net.etwas.autoservice.repo;

import net.etwas.autoservice.model.Car;
import net.etwas.autoservice.model.Employee;
import net.etwas.autoservice.model.Work;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WorkRepo extends JpaRepository<Work, Long> {

    List<Work> findByEmployeeId(Long employeeId);
    List<Work> findByCarId(Long carId);
    List<Work> findByEmployeeAndCar(Employee employee, Car car);

}

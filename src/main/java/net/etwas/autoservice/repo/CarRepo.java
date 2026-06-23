package net.etwas.autoservice.repo;

import net.etwas.autoservice.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepo extends JpaRepository<Car, Long> {

    Car findByLicensePlate(String licensePlate);

}

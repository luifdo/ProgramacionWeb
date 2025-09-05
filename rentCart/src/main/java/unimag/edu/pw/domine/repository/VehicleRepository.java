package unimag.edu.pw.domine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import unimag.edu.pw.domine.entities.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle,Long> {
}

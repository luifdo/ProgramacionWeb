package unimag.edu.pw.domine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import unimag.edu.pw.domine.entities.Station;

public interface StationRepository extends JpaRepository<Station,Long> {
}

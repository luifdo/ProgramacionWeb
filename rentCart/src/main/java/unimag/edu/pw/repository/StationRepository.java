package unimag.edu.pw.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import unimag.edu.co.rentacar.entities.Station;

@Repository
public interface StationRepository extends CrudRepository<Station,Long> {
}

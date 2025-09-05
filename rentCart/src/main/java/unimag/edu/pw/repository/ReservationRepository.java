package unimag.edu.pw.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import unimag.edu.co.rentacar.entities.Reservation;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation,Long> {
}

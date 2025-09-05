package unimag.edu.pw.domine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import unimag.edu.pw.domine.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {
}

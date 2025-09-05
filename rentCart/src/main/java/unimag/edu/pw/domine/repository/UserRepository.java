package unimag.edu.pw.domine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import unimag.edu.pw.domine.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}

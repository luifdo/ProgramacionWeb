package unimag.edu.pw.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import unimag.edu.co.rentacar.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {
}

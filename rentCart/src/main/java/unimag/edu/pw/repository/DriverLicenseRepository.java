package unimag.edu.pw.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import unimag.edu.co.rentacar.entities.DriverLicense;

@Repository
public interface DriverLicenseRepository extends CrudRepository<DriverLicense,Long> {
}

package unimag.edu.pw.domine.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.utility.DockerImageName;
import unimag.edu.pw.domine.entities.Vehicle;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@DataJpaTest
@Testcontainers
class VehicleRepositoryTest {
    @Container
    @ServiceConnection
    static PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>(dockerImageName: "postgress:: id")

    @Autowired
    VehicleRepository vehicleRepository;
    private Vehicle vehicle;

    @BeforeEach
    void setUp() {
    }


    @Test
    @DisplayName("Dado los datos de un vehicle guardarlo en la db")
    void save_vehicle() {
        // arrange
        //atc
        vehicleRepository.save(vehicle);
        //Assert
        assertThat(vehicle.getId()).isNotNull();
    }
}
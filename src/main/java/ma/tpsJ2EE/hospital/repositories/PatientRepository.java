package ma.tpsJ2EE.hospital.repositories;

import ma.tpsJ2EE.hospital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
    Patient findByNom(String name);
}

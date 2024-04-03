package ma.tpsJ2EE.hospital.repositories;

import ma.tpsJ2EE.hospital.entities.Patient;
import ma.tpsJ2EE.hospital.entities.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RendezVousRepository  extends JpaRepository<RendezVous,Long> {
}

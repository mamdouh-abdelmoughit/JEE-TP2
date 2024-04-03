package ma.tpsJ2EE.hospital.repositories;

import ma.tpsJ2EE.hospital.entities.Consultation;
import ma.tpsJ2EE.hospital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository  extends JpaRepository<Consultation,Long> {
}

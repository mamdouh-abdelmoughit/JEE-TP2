package ma.tpsJ2EE.hospital.repositories;

import ma.tpsJ2EE.hospital.entities.Medecin;
import ma.tpsJ2EE.hospital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepository  extends JpaRepository<Medecin,Long> {
    Medecin findByNom(String name);
}

package ma.tpsJ2EE.hospital.service;
import ma.tpsJ2EE.hospital.entities.Consultation;
import ma.tpsJ2EE.hospital.entities.Medecin;
import ma.tpsJ2EE.hospital.entities.Patient;
import ma.tpsJ2EE.hospital.entities.RendezVous;
public interface IHospitalService {
    Patient savePatient(Patient patient);
    Medecin saveMedecin(Medecin medecin);
    RendezVous saveRDV(RendezVous rendezVous);
    Consultation saveConsultation(Consultation consultation);
    Patient findbynom(String name);
    Medecin findBynom(String name);
    RendezVous findbyid(Long id);
    Patient findByid(Long id);
    Medecin FinfById(Long id);
}

package ma.tpsJ2EE.hospital.service;
import jakarta.transaction.Transactional;
import ma.tpsJ2EE.hospital.entities.Consultation;
import ma.tpsJ2EE.hospital.entities.Medecin;
import ma.tpsJ2EE.hospital.entities.Patient;
import ma.tpsJ2EE.hospital.entities.RendezVous;
import ma.tpsJ2EE.hospital.repositories.ConsultationRepository;
import ma.tpsJ2EE.hospital.repositories.MedecinRepository;
import ma.tpsJ2EE.hospital.repositories.PatientRepository;
import ma.tpsJ2EE.hospital.repositories.RendezVousRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional
public class HospitalServiceImpl implements IHospitalService {
    private PatientRepository patientRepository;
    private MedecinRepository medecinRepository;
    private RendezVousRepository rendezVousRepository;
    private ConsultationRepository consultationRepository;
    @Autowired
    public HospitalServiceImpl(PatientRepository patientRepository, MedecinRepository medecinRepository,
                               RendezVousRepository rendezVousRepository, ConsultationRepository consultationRepository) {
        this.patientRepository = patientRepository;
        this.medecinRepository = medecinRepository;
        this.rendezVousRepository = rendezVousRepository;
        this.consultationRepository = consultationRepository;}
    @Override
    public Patient savePatient(Patient patient) {return patientRepository.save(patient);}
    @Override
    public Medecin saveMedecin(Medecin medecin) {return medecinRepository.save(medecin);}
    @Override
    public RendezVous saveRDV(RendezVous rendezVous) {return rendezVousRepository.save(rendezVous);}
    @Override
    public Consultation saveConsultation(Consultation consultation) {return consultationRepository.save(consultation);}
    @Override
    public Patient findbynom(String name) {return null;}
    @Override
    public Medecin findBynom(String name) {
        return null;
    }
    @Override
    public RendezVous findbyid(Long id) {
        return rendezVousRepository.findById(id).orElse(null);
    }
    @Override
    public Patient findByid(Long id) {
        return patientRepository.findById(id).orElse(null);
    }
    @Override
    public Medecin FinfById(Long id) {return medecinRepository.findById(id).orElse(null);}

}

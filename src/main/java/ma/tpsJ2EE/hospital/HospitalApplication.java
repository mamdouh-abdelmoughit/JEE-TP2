package ma.tpsJ2EE.hospital;

import ma.tpsJ2EE.hospital.entities.*;
import ma.tpsJ2EE.hospital.repositories.ConsultationRepository;
import ma.tpsJ2EE.hospital.repositories.MedecinRepository;
import ma.tpsJ2EE.hospital.repositories.PatientRepository;
import ma.tpsJ2EE.hospital.repositories.RendezVousRepository;
import ma.tpsJ2EE.hospital.service.IHospitalService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class HospitalApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalApplication.class, args);

	}
	@Bean
	CommandLineRunner start(IHospitalService hospitalService){
							//PatientRepository patientRepository,
							//MedecinRepository medecinRepository,
							//RendezVousRepository rendezVousRepository,
							//ConsultationRepository consultationRepository){
		return args ->{
			//patientRepository.save(new Patient(null,"Oumni",new Date(),false,null));
			//Patient
			           Stream.of("Patient1","Patient2","Patient3")
							   .forEach(name->{
							Patient patient=new Patient();
							patient.setNom(name);
							patient.setDateNaissance(new Date());
							patient.setMalade(false);
							//patientRepository.save(patient);
							hospitalService.savePatient(patient);
								   });

						//Medecin
						Stream.of("Medecin1","Medecin2","Medecin3")
								.forEach(name->{
									Medecin medecin=new Medecin();
									medecin.setNom(name);
									medecin.setEmail(name+"@gmail.com");
									medecin.setSpecialite(Math.random()>0.5?"Cardio":"Dentiste");
									//medecinRepository.save(medecin);
									hospitalService.saveMedecin(medecin);


					           });
		//Chercher un patient par son id/nom
		//Patient patient =patientRepository.findById(1L).orElse(null);
		//Patient patient1 =patientRepository.findByNom("Patient1");
			Patient patient=hospitalService.findByid(1L);
			Patient patient1=hospitalService.findbynom("Patient1");

        //chercher un medecin par son nom
		//Medecin medecin=medecinRepository.findByNom("Medecin1");
			Medecin medecin1=hospitalService.findBynom("Medecin1");
			Medecin medecin=hospitalService.FinfById(1L);

		//RDV
			RendezVous rendezVous=new RendezVous();
			rendezVous.setDate(new Date());
			rendezVous.setStatus(StatusRDV.PENDING);
			rendezVous.setMedecin(medecin);
			rendezVous.setPatient(patient);
			//rendezVousRepository.save(rendezVous);
			hospitalService.saveRDV(rendezVous);

		//Consultation
			//RendezVous rendezVous1=rendezVousRepository.findById(1L).orElse(null);
			RendezVous rendezVous1=hospitalService.findbyid(1L);
			Consultation consultation= new Consultation();
			consultation.setDateConsultation(new Date());
			consultation.setRendezVous(rendezVous1);
			consultation.setRapport("Rapport de la consultation : ");
			//consultationRepository.save(consultation);
			hospitalService.saveConsultation(consultation);



		};
	}

}



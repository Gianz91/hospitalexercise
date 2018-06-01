package it.objectway.hospital.hospitalexercise.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.objectway.hospital.hospitalexercise.dao.PatientRepository;
import it.objectway.hospital.hospitalexercise.model.Patient;

@Service("patientService")
public class PatientService {
	private static Logger log = LoggerFactory.getLogger(PatientService.class);
	@Autowired
	private PatientRepository patRepo;

	@Transactional
	public List<Patient> getAllPatients() {
		List<Patient> patients = new ArrayList<>();
		Iterable<Patient> psIterable = patRepo.findAll();
		Iterator<Patient> pssIterator = psIterable.iterator();
		while (pssIterator.hasNext()) {
			patients.add(pssIterator.next());
		}
		log.debug("{}", patients);
		return patients;

	}
	
	@Transactional
	public Patient getPatient(int id) {
		Optional<Patient> opt = patRepo.findById(id);
		return opt.get();
	}
	
	@Transactional
	public void addPatient(Patient p) {
		patRepo.save(p);
	}
	
	@Transactional void updatePatient(Patient p) {
		patRepo.save(p);
	}

}

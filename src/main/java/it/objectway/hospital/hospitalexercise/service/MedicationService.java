package it.objectway.hospital.hospitalexercise.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.objectway.hospital.hospitalexercise.dao.MedicationRepository;
import it.objectway.hospital.hospitalexercise.model.Medication;

@Service("medicationService")
public class MedicationService {
	private static Logger log = LoggerFactory.getLogger(MedicationService.class);
	
	@Autowired
	private MedicationRepository medicRepo;
	
	
	public List<Medication> getAllMedication(){
		List<Medication> meds = new ArrayList<>();
		Iterable<Medication> medIterable =  medicRepo.findAll();
		Iterator<Medication> medIterator = medIterable.iterator();
		while(medIterator.hasNext()) {
			meds.add(medIterator.next());
		}
		log.debug("{}",meds);
		return meds;
	}
	public Medication getMedication(int id) {
		Optional<Medication> opt = medicRepo.findById(id);
		return opt.get();
	}
}

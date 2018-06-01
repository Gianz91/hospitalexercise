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

import it.objectway.hospital.hospitalexercise.dao.PhysicianRepository;
import it.objectway.hospital.hospitalexercise.model.Physician;

@Service("physicianService")
public class PhysicianService {
	
	private static Logger log = LoggerFactory.getLogger(PhysicianService.class);
	@Autowired
	PhysicianRepository physicianRepo;
	
	@Transactional
	public List<Physician> getAllPhysicians() {
		List<Physician> physicians = new ArrayList<>();
		Iterable<Physician> physsIterable=physicianRepo.findAll();
		Iterator<Physician> physssIterator=physsIterable.iterator();
		while(physssIterator.hasNext()) {
			physicians.add(physssIterator.next());
		}
		log.debug("{}",physicians);
		return physicians;
		
	}
	
	@Transactional
	public Physician getPhysician(int id) {
		Optional<Physician> opt = physicianRepo.findById(id);
		return opt.get();
	}
}

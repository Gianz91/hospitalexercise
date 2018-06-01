package it.objectway.hospital.hospitalexercise.dao;

import org.springframework.data.repository.CrudRepository;

import it.objectway.hospital.hospitalexercise.model.Medication;

public interface MedicationRepository extends CrudRepository<Medication, Integer> {

}

package it.objectway.hospital.hospitalexercise.dao;

import org.springframework.data.repository.CrudRepository;

import it.objectway.hospital.hospitalexercise.model.Patient;

public interface PatientRepository extends CrudRepository<Patient, Integer> {

}

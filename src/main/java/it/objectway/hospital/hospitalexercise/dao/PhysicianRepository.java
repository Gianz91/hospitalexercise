package it.objectway.hospital.hospitalexercise.dao;

import org.springframework.data.repository.CrudRepository;

import it.objectway.hospital.hospitalexercise.model.Physician;

public interface PhysicianRepository extends CrudRepository<Physician, Integer> {

}

package it.objectway.hospital.hospitalexercise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import it.objectway.hospital.hospitalexercise.model.Patient;
import it.objectway.hospital.hospitalexercise.service.PatientService;

@Controller
public class PatientController {
	@Autowired
	private PatientService patService;
	
	@RequestMapping(value="/allPatients", method=RequestMethod.GET)
	public String getAllPatients(ModelMap model) {
		model.addAttribute("patients", patService.getAllPatients());
		return "patientlist";
	}
	
	@RequestMapping(value="/patient/{ssn}", method=RequestMethod.GET)
	public ModelAndView getSinglePatient(@PathVariable Integer ssn) {
		return new ModelAndView("singlepat","patient", patService.getPatient(ssn));
	}
	@RequestMapping(value="/newPatient", method=RequestMethod.POST)
	public ModelAndView createNewPat(@ModelAttribute Patient patient) {
		patService.addPatient(patient);
		return new ModelAndView("patientlist","patients", patService.getPatient(patient.getSsn()));
		
	}
}

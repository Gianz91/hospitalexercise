package it.objectway.hospital.hospitalexercise.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.objectway.hospital.hospitalexercise.service.PhysicianService;

@Controller
public class PhysicianController {
	private static Logger lo = LoggerFactory.getLogger(PhysicianController.class);
	@Autowired
	private PhysicianService physService;
	
	@RequestMapping(value="/allPhysicians", method=RequestMethod.GET)
	public String prendiPhysicians(ModelMap model) {
	 model.addAttribute("physicians",physService.getAllPhysicians());
	 return "physlist";
	}
	@RequestMapping(value="/physician/{employeeid}",method=RequestMethod.GET)
	public String prendiUnPhysician(@PathVariable Integer employeeid, ModelMap mod) {
		lo.debug("{}",employeeid);
		mod.addAttribute("physician",physService.getPhysician(employeeid));
		return "singlephy";
	}

}

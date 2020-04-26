package com.PatientDetailsApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.PatientDetailsApp.dao.PatientRepository;
import com.PatientDetailsApp.model.PatientDetails;







@RestController
public class PatientController {
	@Autowired
	private PatientRepository repository;
	
	@PostMapping("/addPatient")
	public String addPatient(@RequestBody PatientDetails patient ) {
		repository.save(patient);
		 return "Patient Added";
	}
	@PostMapping("/addPatients")
	public List<PatientDetails> addPatients(@RequestBody List<PatientDetails> patients ) {
		return repository.saveAll(patients);
	}
	@GetMapping("/getPatients")
	public List<PatientDetails> getPatients(){
		return repository.findAll();
	}
	@GetMapping("/getPatient/{id}")
	public List<PatientDetails> getPatientById(@PathVariable int id){
		return repository.findById(id);
	}
	
	@DeleteMapping("delete/{id}")
	public String deletePatientById(@PathVariable int id){
		
		repository.deleteById(id);
		
		return "the patient is deleted " + id;
	}

	 
	
	
	
	
}

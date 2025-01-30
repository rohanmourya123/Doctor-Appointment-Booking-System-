package com.dca.micro.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dca.micro.Service.PatientService;
import com.dca.micro.entity.DCA_Patient;

@RestController
@RequestMapping("/patient")
public class PatientController {
	
	@Autowired
	PatientService patientService;
	
	@PostMapping
	public ResponseEntity<DCA_Patient> create(@RequestBody DCA_Patient patient){
		return ResponseEntity.status(HttpStatus.CREATED).body(patientService.create(patient));
	}
	
	@GetMapping
	public ResponseEntity<List<DCA_Patient>> getallPatient(){
		return ResponseEntity.status(HttpStatus.FOUND).body(patientService.getAllPatient());
	}
	
	@GetMapping("/{patientId}")
	public ResponseEntity<DCA_Patient> getPatient(@PathVariable String patientId){
		return ResponseEntity.status(HttpStatus.FOUND).body(patientService.getPatient(patientId));
	}
	@PutMapping("/{patientId}")
	public ResponseEntity<Void> updatePatient(@RequestBody DCA_Patient dca_Patient ,@PathVariable String patientId){
		patientService.updatePatient(dca_Patient,patientId);
		return ResponseEntity.status(HttpStatus.OK).build();
		
	}
	@DeleteMapping("/{patientId}")
	public ResponseEntity<Void> deletePatient(@PathVariable String patientId){
		patientService.deletePatient(patientId);
		return ResponseEntity.status(HttpStatus.OK).build();
		
	}
	
}

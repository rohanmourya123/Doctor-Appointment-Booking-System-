package com.dac.aop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dac.aop.micro.entity.DCA_Doctor;
import com.dac.aop.service.DCA_service;

@RestController
@RequestMapping("/doctor")
public class DCA_Controller {
	@Autowired
	DCA_service dca_service;
	
	@GetMapping
	public ResponseEntity<List<DCA_Doctor>>getAllDoctor()
	{
		List<DCA_Doctor> dca_doctor=dca_service.getAllDoctor();
		if(dca_doctor.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
		return ResponseEntity.status(HttpStatus.FOUND).body(dca_doctor);	
		
}
	@PostMapping
	public ResponseEntity<DCA_Doctor> create(@RequestBody DCA_Doctor doctor){
		return ResponseEntity.status(HttpStatus.CREATED).body(dca_service.create_Doctor(doctor));
	}
	@GetMapping("/{doctorId}")
	public ResponseEntity< DCA_Doctor> getDoctor(@PathVariable String doctorId){
		return ResponseEntity.status(HttpStatus.FOUND).body(dca_service.get_Doctor(doctorId));
	}
	public ResponseEntity<Void> updateDoctor(@RequestBody DCA_Doctor dca_Doctor,@PathVariable String doctorId) {
		dca_service.update_Doctor(dca_Doctor,doctorId);
		return ResponseEntity.status(HttpStatus.OK).build();
	}

	public ResponseEntity<Void> deleteDoctor(@PathVariable String doctorId){
		dca_service.delete_Doctor(doctorId);
		return ResponseEntity.status(HttpStatus.OK).build();
		
	}
	
	
}


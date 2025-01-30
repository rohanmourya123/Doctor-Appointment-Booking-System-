package com.dac.aop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@PutMapping("/{doctorId}")
	public ResponseEntity<Void> updateDoctor(@RequestBody DCA_Doctor dca_Doctor,@PathVariable String doctorId) {
		dca_service.update_Doctor(dca_Doctor,doctorId);
		return ResponseEntity.status(HttpStatus.OK).build();
	}
	
     @DeleteMapping("/{doctorId}")
	public ResponseEntity<Void> deleteDoctor(@PathVariable String doctorId){
		dca_service.delete_Doctor(doctorId);
		return ResponseEntity.status(HttpStatus.OK).build();
		
	}
     @GetMapping("/patient/{patientId}")
     public ResponseEntity<List<DCA_Doctor> > getDoctorByPatId(@PathVariable String patientId){
    	 List<DCA_Doctor> lst =dca_service.getDoctorByPatId(patientId);
    	 if(lst.isEmpty())
    		 return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    	 else
		return ResponseEntity.status(HttpStatus.FOUND).body(lst);
     }
     
     @GetMapping("/experience/{experienceId}")
     public ResponseEntity<List<DCA_Doctor> >getDoctorByExperId(@PathVariable String experinceId){
    	 List<DCA_Doctor> elst=dca_service.getDoctorByExperId(experinceId);
    	 if(elst.isEmpty())
    		 return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    	 else
    		 
		return ResponseEntity.status(HttpStatus.FOUND).body(elst);
    	 
     }
     
	@GetMapping("/appointment/{appointmentId}")
     public ResponseEntity<List<DCA_Doctor>>getDoctorByAppId(@PathVariable String appointmentId){
    	 List<DCA_Doctor>alst=dca_service.getDoctorByAppId(appointmentId);
    	 if(alst.isEmpty())
    		 return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    	 else
		return ResponseEntity.status(HttpStatus.FOUND).body(alst);
     }
     
	@GetMapping("/receptionist/{receptionistId}")
     public ResponseEntity<List<DCA_Doctor>>getDoctorByRecpId(@PathVariable String receptionistId){
    	 List<DCA_Doctor>klst=dca_service.getDoctorByRecpId(receptionistId);
    	 if(klst.isEmpty())
    		 return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    	 else
    		 return ResponseEntity.status(HttpStatus.FOUND).body(klst);
     }
	
	
	@GetMapping("/user/{userId}")
    public ResponseEntity<List<DCA_Doctor>>getDoctorByUserId(@PathVariable String userId){
   	 List<DCA_Doctor>ulst=dca_service.getDoctorByUserId(userId);
   	 if(ulst.isEmpty())
   		 return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
   	 else
   		 return ResponseEntity.status(HttpStatus.FOUND).body(ulst);
    }
}


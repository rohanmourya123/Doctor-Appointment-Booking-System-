package com.dac.aop.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dac.aop.micro.entity.DCA_Doctor;

@Service
public interface DCA_service {
	DCA_Doctor create_Doctor(DCA_Doctor name);
	void update_Doctor(DCA_Doctor doctor, String id);
	void delete_Doctor(String id);
	DCA_Doctor get_Doctor(String id);
	
	List<DCA_Doctor> getAllDoctor();
	List<DCA_Doctor> getDoctorByPatId (String patientId);
   List<DCA_Doctor> getDoctorByExperId(String experienceId);
	List<DCA_Doctor> getDoctorByAppId(String appointmentId);
List<DCA_Doctor> getDoctorByRecpId(String receptionistId);
	
List<DCA_Doctor> getDoctorByUserId(String userId);

}

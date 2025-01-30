package com.dac.aop.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dac.aop.micro.entity.*;

public interface DCA_repo extends JpaRepository<DCA_Doctor, String>
{
	List<DCA_Doctor> findByPatientId(String patientId);

	List<DCA_Doctor> findByExperienceId(String experienceId);

	List<DCA_Doctor> findByAppointmentId(String appointmentId);

	List<DCA_Doctor> findByReceptionistId(String receptionistId);
	
	List<DCA_Doctor> findByUserId(String UserId);
	
	
	
}
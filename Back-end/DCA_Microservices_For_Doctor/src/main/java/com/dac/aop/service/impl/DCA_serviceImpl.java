package com.dac.aop.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dac.aop.micro.entity.DCA_Doctor;
import com.dac.aop.repo.DCA_repo;
import com.dac.aop.service.DCA_service;

@Service
public class DCA_serviceImpl implements DCA_service {
	
	@Autowired
	DCA_repo dca_repo;
	
	@Override
	public DCA_Doctor create_Doctor(DCA_Doctor doctor) {
		doctor.setDoctorId(UUID.randomUUID().toString());
		return dca_repo.save(doctor);
		
	}

	@Override
	public void update_Doctor(DCA_Doctor doctor, String id) {
		doctor.setDoctorId(id);
		dca_repo.save(doctor);
	}

	@Override
	public void delete_Doctor(String id){
       dca_repo.deleteById(id);
	}

	@Override
	public DCA_Doctor get_Doctor(String id) {
	
		return dca_repo.findById(id).get();
	}

	@Override
	public List<DCA_Doctor> getAllDoctor() {
		
		return dca_repo.findAll() ;
	}

	@Override
	public List<DCA_Doctor> getDoctorByPatId(String patientId) {
		List<DCA_Doctor> lst= dca_repo.findByPatientId(patientId);
		lst.forEach(x->System.out.println(x)) ;
		return lst;
	}
	
	public List<DCA_Doctor> getDoctorByExperId(String experienceId ){
		List<DCA_Doctor> elst= dca_repo.findByExperienceId( experienceId );
		elst.forEach(y->System.out.println(y));
		return elst;
	}
	
	public List<DCA_Doctor> getDoctorByAppId( String appointmentId ){
		List<DCA_Doctor> alst=dca_repo.findByAppointmentId(appointmentId);
			alst.forEach(a->System.out.println(a));
			return  alst;
			 
			
		}
	public List<DCA_Doctor>getDoctorByRecpId(String receptionistId){
		List<DCA_Doctor>klst=dca_repo.findByReceptionistId(receptionistId);
		klst.forEach(s->System.out.println(s));
		return klst;
		
		
	}

	@Override
	public List<DCA_Doctor> getDoctorByUserId(String userId) {
		List<DCA_Doctor>ulst=dca_repo.findByUserId(userId);
		ulst.forEach(s->System.out.println(s));
		return ulst;
	}
	}


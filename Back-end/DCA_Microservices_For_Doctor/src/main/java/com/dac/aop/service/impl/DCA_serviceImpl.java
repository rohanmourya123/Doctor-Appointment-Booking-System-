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
		doctor.setDoctorid(UUID.randomUUID().toString());
		return dca_repo.save(doctor);
		
	}

	@Override
	public void update_Doctor(DCA_Doctor doctor, String id) {
		doctor.setDoctorid(id);
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
	
}

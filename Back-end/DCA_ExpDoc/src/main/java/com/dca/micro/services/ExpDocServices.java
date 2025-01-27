package com.dca.micro.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dca.micro.entity.ExpDoc;
import com.dca.micro.repository.ExpDocRespository;

@Service
public class ExpDocServices {

	@Autowired
	ExpDocRespository expDocRespository;
	
	public ExpDoc createExperience(ExpDoc expDoc) {
		expDoc.setExperience_id(UUID.randomUUID().toString());
		return expDocRespository.save(expDoc);
	}
	
	public List<ExpDoc> getAllExperience() {
		return expDocRespository.findAll();
	}
	
	public ExpDoc getSingleExperience(String experience_id) {
		return expDocRespository.findById(experience_id).get();
	}
	
	public void updateExperience(String experience_id, ExpDoc expDoc) {
		expDoc.setExperience_id(experience_id);
		expDocRespository.save(expDoc);
	}
	
	public void deleteExperience(String experience_id) {
		expDocRespository.deleteById(experience_id);
	}
}

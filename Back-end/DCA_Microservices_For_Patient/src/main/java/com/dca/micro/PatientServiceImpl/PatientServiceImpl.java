package com.dca.micro.PatientServiceImpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dca.micro.Repository.PatientRepository;
import com.dca.micro.Service.PatientService;
import com.dca.micro.entity.DCA_Patient;
@Service
public class PatientServiceImpl implements PatientService {
	
	@Autowired
	PatientRepository patientRepository;

	@Override
	public DCA_Patient create(DCA_Patient patient) {
		patient.setPatient_Id(UUID.randomUUID().toString());
		return patientRepository.save(patient);
	}

	@Override
	public List<DCA_Patient> getAllPatient() {
		
		return patientRepository.findAll();
	}

	public void updatePatient(DCA_Patient patient, String id) {
	 patient.setPatient_Id(id);
	 patientRepository.save(patient);
	 
	}

	@Override
	public DCA_Patient getPatient(String id) {
	
		return patientRepository.findById(id).get();
	}

	@Override
	public void deletePatient(String id) {
		patientRepository.deleteById(id);
		
	}

}
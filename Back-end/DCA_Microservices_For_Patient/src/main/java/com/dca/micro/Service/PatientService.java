package com.dca.micro.Service;

import java.util.List;

import com.dca.micro.entity.DCA_Patient;

public interface PatientService {
	DCA_Patient create(DCA_Patient patient);
	List<DCA_Patient> getAllPatient();
	void updatePatient(DCA_Patient patient,String id);
	DCA_Patient getPatient(String id);
	void deletePatient(String id);
}

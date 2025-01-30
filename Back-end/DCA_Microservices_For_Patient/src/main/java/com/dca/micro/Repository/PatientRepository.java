package com.dca.micro.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dca.micro.entity.DCA_Patient;

public interface PatientRepository  extends JpaRepository<DCA_Patient,String> {
	
}



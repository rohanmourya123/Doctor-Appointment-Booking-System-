package com.dac.aop.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dac.aop.micro.entity.*;

public interface DCA_repo extends JpaRepository<DCA_Doctor, String>
{
	
}
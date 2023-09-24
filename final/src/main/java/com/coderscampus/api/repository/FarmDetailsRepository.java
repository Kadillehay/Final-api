package com.coderscampus.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coderscampus.api.domain.FarmDetails;

@Repository
public interface FarmDetailsRepository extends JpaRepository <FarmDetails, Long> {
	
	
	
	
	

}

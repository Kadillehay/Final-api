package com.coderscampus.api.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.api.domain.FarmDetails;
import com.coderscampus.api.domain.User;
import com.coderscampus.api.repository.FarmDetailsRepository;
import com.coderscampus.api.repository.FarmRegisterRepository;

@RestController
@CrossOrigin(origins = "*")
public class FarmRegistryController {
	
	@Autowired
	FarmRegisterRepository farmRegisterRepo; 
	@Autowired
	FarmDetailsRepository farmDetailsRepo;
	
	@PostMapping("/register")
	public ResponseEntity<User> submitRegister(@RequestBody User farmRegistry) {
		User registered = farmRegisterRepo.save(farmRegistry);
		FarmDetails farmDetails = new FarmDetails();
		farmDetails.setUser(registered);
		farmDetailsRepo.save(farmDetails);
		System.out.println("working?");
		return ResponseEntity.ok(registered);
	}
	
}

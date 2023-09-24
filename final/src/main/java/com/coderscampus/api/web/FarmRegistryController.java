package com.coderscampus.api.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.api.domain.User;
import com.coderscampus.api.repository.FarmRegisterRepository;

@RestController
@CrossOrigin(origins = "*")
public class FarmRegistryController {
	
	@Autowired
	FarmRegisterRepository farmRegisterRepo; 
	
	@PostMapping("/register")
	public ResponseEntity<User> submitRegister(@RequestBody User farmRegistry) {
		User registered = farmRegisterRepo.save(farmRegistry);
		return ResponseEntity.ok(registered);
	}
	
}

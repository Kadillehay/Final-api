package com.coderscampus.api.web;

import java.util.List;

import org.springframework.beans.BeanUtils;
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
	public ResponseEntity<List<Object>> submitRegister(@RequestBody User farmRegistry) {
		User user = new User();
		BeanUtils.copyProperties(farmRegistry, user);
		
		
		
		User registered = farmRegisterRepo.save(user);
		System.out.println("working?");
		return ResponseEntity.ok(List.of(registered.getId(), registered.getFarmName()));
	}
	
}

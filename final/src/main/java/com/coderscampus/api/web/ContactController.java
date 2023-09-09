package com.coderscampus.api.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.api.domain.ContactMessage;
import com.coderscampus.api.repository.ContactMessageRepository;

@RestController
@CrossOrigin(origins="*")
public class ContactController {
	
	@Autowired
	private ContactMessageRepository contactMessageRepo;
	
	@PostMapping("/contact")
	public ResponseEntity<ContactMessage> submitContactForm(@RequestBody ContactMessage contactMessage) {
		
		ContactMessage savedMessage = contactMessageRepo.save(contactMessage);
		return ResponseEntity.ok(savedMessage);
	}

}

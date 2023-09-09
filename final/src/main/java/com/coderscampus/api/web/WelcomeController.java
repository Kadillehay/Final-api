package com.coderscampus.api.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.api.domain.Farm;

@RestController
@CrossOrigin(origins="*")
public class WelcomeController {

	@GetMapping ("/welcome")
	public ResponseEntity<Farm> welcome() {

		Farm farm = new Farm();
		farm.setName("PhinFarm");
		farm.setProduct("vergible");
		
		return ResponseEntity.ok(farm);

	}

}

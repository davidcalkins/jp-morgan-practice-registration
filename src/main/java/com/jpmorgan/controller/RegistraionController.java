package com.jpmorgan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpmorgan.beans.Author;
import com.jpmorgan.service.RegistrationService;


@RestController
@RequestMapping("/authors")
public class RegistraionController {
	
	@Autowired
	RegistrationService regService;
	
	@PostMapping
	public void regiserNew(@RequestBody Author newAuthor) {
		System.out.println(newAuthor);
		System.out.println(newAuthor.getUsername());
		newAuthor.setAuthorID(1);
		regService.registerNew(newAuthor);
	}
	
	
}

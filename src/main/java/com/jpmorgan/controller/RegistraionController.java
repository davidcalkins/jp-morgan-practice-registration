package com.jpmorgan.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpmorgan.beans.Author;


@RestController
@RequestMapping("/authors")
public class RegistraionController {
	
	
	@PostMapping
	public void regiserNew(@RequestBody Author newAuthor) {
		System.out.println(newAuthor);
		System.out.println(newAuthor.getUsername());
	}
	
	
}

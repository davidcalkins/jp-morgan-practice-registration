package com.jpmorgan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpmorgan.beans.Author;
import com.jpmorgan.repository.AuthorRepository;

@Service
public class RegistrationService {
	
	@Autowired
	AuthorRepository authorRepo;
	
	public boolean registerNew(Author author) {
		if (author == null) {
			//TODO: Log error and return
		}
		
		authorRepo.save(author);
	}
	
}

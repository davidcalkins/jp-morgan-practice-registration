package com.jpmorgan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpmorgan.beans.Author;
import com.jpmorgan.repository.AuthorRepository;

@Service
public class RegistrationService {
	
	@Autowired
	AuthorRepository authorRepo;
	
	public void registerNew(Author author) {
		
		if (author == null) {
			//TODO: Log error and return
			System.out.println("Author is null");
		}
		else if (!authorRepo.existsByUsername(author.getUsername())) {
			author = authorRepo.save(author);
			System.out.println("Saved new Author");
		}
		else {
			//TODO: User already exists.
			System.out.println("Author Already Exists");
		}
		
	}
	
}

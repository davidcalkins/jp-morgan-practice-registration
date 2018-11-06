package com.jpmorgan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpmorgan.beans.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer>{
	
	public Author findByAuthorID(int authorId);
	public Author findByUsername(String username);
	public Author findByUsernameAndPassword(String username, String password);
}

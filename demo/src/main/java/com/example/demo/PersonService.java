package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService 
{
	@Autowired
	private PersonRepo repo;
	
	public List<Person> getAllPerson()
	{
		return repo.findAll();
	}
	
	public PersonService(PersonRepo repo) 
	{
		this.repo=repo;
	}
	
}

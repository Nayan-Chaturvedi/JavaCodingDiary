package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController
{
	@Autowired
	private PersonService personService;
	
	@GetMapping("/persons")
	public ResponseEntity<?> getAllStudent()
	{
		return ResponseEntity.ok(personService.getAllPerson());
	}
}

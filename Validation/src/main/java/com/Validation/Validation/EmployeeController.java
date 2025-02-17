package com.Validation.Validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
public class EmployeeController
{
	@Autowired
	EmployeeRepo employeeRepo;
	
	@PostMapping("/save")
	public ResponseEntity<Object> saveEmployee(@RequestBody @Valid Employee employee)
	{
		employeeRepo.save(employee);
		return ResponseEntity.status(HttpStatus.CREATED).body("Employee saved Successfully");
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Employee> getById(@PathVariable Integer id)
	{
		Employee emp= employeeRepo.findById(id)
				.orElseThrow(()->new EmployeeNotFoundException("Employee not found for id.."));
		
		
		return ResponseEntity.status(HttpStatus.FOUND).body(emp);

	}
}

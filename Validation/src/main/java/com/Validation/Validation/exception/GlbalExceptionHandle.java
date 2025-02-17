package com.Validation.Validation.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.Validation.Validation.EmployeeNotFoundException;

@ControllerAdvice
public class GlbalExceptionHandle
{
	@ExceptionHandler(value = MethodArgumentNotValidException.class)
	public ResponseEntity<Object> MethodArgumentNotValidException(MethodArgumentNotValidException exception)
	{
		Map<String, String> errorMap=new HashMap<String, String>();
		exception.getFieldErrors().stream().forEach(error->
		errorMap.put(error.getField(), error.getDefaultMessage()));
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMap);
		
	}
	
	@ExceptionHandler(value = EmployeeNotFoundException.class)
	public ResponseEntity<Object> EmployeeNotFoundException(EmployeeNotFoundException exception)
	{
		Map<String, String> errorMap=new HashMap<String, String>();
		errorMap.put("error Message", exception.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMap);

	}
}

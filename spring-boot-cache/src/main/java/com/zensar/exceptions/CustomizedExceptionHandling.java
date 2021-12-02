package com.zensar.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomizedExceptionHandling extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(StudentNotFoundException.class)
	public ResponseEntity<Object> handleException(StudentNotFoundException exception){
		ExceptionResponse response=new ExceptionResponse();
		response.setMessage("Student Not Found");
		response.setDateTime(LocalDateTime.now());
		ResponseEntity<Object> entity=new ResponseEntity<Object>(response,HttpStatus.NOT_FOUND);
		return entity;
	}
	
	
	

}

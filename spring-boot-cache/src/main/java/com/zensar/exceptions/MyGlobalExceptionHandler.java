package com.zensar.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyGlobalExceptionHandler {
	
	@ExceptionHandler
	public void addExceptionHandler(ArithmeticException e) {
		e.printStackTrace();
	}
	

}

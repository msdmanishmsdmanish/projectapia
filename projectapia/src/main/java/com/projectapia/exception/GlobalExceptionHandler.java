package com.projectapia.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<?>resourceNotFoundException(ResourceNotFoundException e,WebRequest webRequest){
		return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		
	}

}

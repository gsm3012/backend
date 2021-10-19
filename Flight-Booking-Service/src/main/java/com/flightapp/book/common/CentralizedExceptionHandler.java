package com.flightapp.book.common;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CentralizedExceptionHandler
{
	
	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<String> handleNoSuchElementException(NoSuchElementException ex)
	{
		return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
	}
	
//	@ExceptionHandler(MethodArgumentNotValidException.class)
//	public ResponseEntity<Map<String, String>> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
//			HttpHeaders headers, HttpStatus status, WebRequest request) {
//		
//		Map<String, String> errors = new HashMap<>();
//		
//		ex.getBindingResult().getAllErrors().forEach(error -> {
//			
//			String field = ((FieldError) error).getField();
//			String message = error.getDefaultMessage();
//			errors.put(field, message);
//		});
//		
//		return new ResponseEntity<Map<String, String>>(errors, HttpStatus.BAD_REQUEST);
//	}
//		
//	@ExceptionHandler(IllegalStateException.class)
//	public ResponseEntity<String> handleIllegalStateException(IllegalStateException ex)
//	{	
//		return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
//	}
	
	
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<List<String>> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex)
	{
		List<String> errors = new ArrayList<>();
		
		ex.getBindingResult().getAllErrors().forEach(e->{
			
			errors.add(e.getDefaultMessage());
			
		});
		
		return new ResponseEntity<List<String>>(errors, HttpStatus.BAD_REQUEST);
	}
}

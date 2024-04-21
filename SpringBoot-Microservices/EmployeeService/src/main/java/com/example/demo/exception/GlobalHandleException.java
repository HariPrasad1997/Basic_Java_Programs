package com.example.demo.exception;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalHandleException extends ResponseEntityExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<EmployeeDetails> handleResourceNotFoundException(ResourceNotFoundException exception,
			WebRequest request) {
		EmployeeDetails employeeDetails = new EmployeeDetails(LocalDateTime.now(), exception.getMessage(),
				request.getDescription(false), "EMPLOYEE_NOT_FOUND");
		return new ResponseEntity<EmployeeDetails>(employeeDetails, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(EmailAlreadyExistsException.class)
	public ResponseEntity<EmployeeDetails> handleEmailAlreadyExistsException(EmailAlreadyExistsException exception,
			WebRequest request) {
		EmployeeDetails employeeDetails = new EmployeeDetails(LocalDateTime.now(), exception.getMessage(),
				request.getDescription(false), "EMPLOYEE_EMAIL_ALREADY-EXISTS");
		return new ResponseEntity<EmployeeDetails>(employeeDetails, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<EmployeeDetails> handleGlobalException(Exception exception, WebRequest request) {
		EmployeeDetails details = new EmployeeDetails(LocalDateTime.now(), exception.getMessage(),
				request.getDescription(false), "INTERNAL_SERVER_ERROR");
		return new ResponseEntity<>(details, HttpStatus.INTERNAL_SERVER_ERROR);

	}

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatusCode status, WebRequest request) {
		Map<String, String> errors = new HashMap<>();
		List<ObjectError> errorList = ex.getBindingResult().getAllErrors();
		errorList.forEach((error) -> {
			String fieldName = ((FieldError) error).getField();
			String message = error.getDefaultMessage();
			errors.put(fieldName, message);
		});
		return new ResponseEntity<Object>(errors, HttpStatus.BAD_REQUEST);
	}
	

}
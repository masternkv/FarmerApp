package com.farmer.app.Exception;


import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.farmer.app.common.ResponseMessage;

@ControllerAdvice
public class GenericExceptionHandler extends ResponseEntityExceptionHandler{
	     
	    @ExceptionHandler(RecordNotFoundException.class)
	    public final ResponseEntity<ErrorResponse> handleUserNotFoundException
	                        (RecordNotFoundException ex, WebRequest request) 
	    {
	        List<String> details = new ArrayList<>();
	        details.add(ex.getLocalizedMessage());
	        ErrorResponse error = new ErrorResponse(ResponseMessage.RECORD_NOT_FOUND.toString(), details);
	        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	    }
	     
	    @ExceptionHandler(MissingHeaderInfoException.class)
	    public final ResponseEntity<ErrorResponse> handleInvalidTraceIdException
	                        (MissingHeaderInfoException ex, WebRequest request) {
	        List<String> details = new ArrayList<>();
	        details.add(ex.getLocalizedMessage());
	        ErrorResponse error = new ErrorResponse(ResponseMessage.BAD_REQUEST.toString(), details);
	        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	    }

}

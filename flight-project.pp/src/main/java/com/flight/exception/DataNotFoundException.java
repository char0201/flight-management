package com.flight.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)//if we are error what we cannot find the sever will check

public class DataNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;
    private  String resourceName; //with in the class
    private String fieldName;
    private Object fieldValue;
    public DataNotFoundException(String resourceName, String fieldName, Object fieldValue) {
        super();
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }
}

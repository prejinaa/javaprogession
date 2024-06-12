package com.example.RestApplication.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CloudVendorHandler {
    @ExceptionHandler(value = {CloudVendorExceptionNotFound.class})
    public ResponseEntity<Object> handleCloudVendorNotFoundException
            (CloudVendorExceptionNotFound cloudVendorExceptionNotFound)
    {
        CloudVendorException cloudVendorException = new CloudVendorException(
                cloudVendorExceptionNotFound.getMessage(),
                cloudVendorExceptionNotFound.getCause(),
                HttpStatus.NOT_FOUND
        );

        return new ResponseEntity<>(cloudVendorException, HttpStatus.NOT_FOUND);
    }
}

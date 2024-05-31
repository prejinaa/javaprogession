package com.example.RestApplication.exception;

public class CloudVendorExceptionNotFound extends RuntimeException{

    public CloudVendorExceptionNotFound(String message) {
        super(message);
    }

    public CloudVendorExceptionNotFound(String message, Throwable cause) {
        super(message, cause);
    }
}

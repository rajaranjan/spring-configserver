package com.in28minutes.rest.webservices.restfulwebservices.exception;

import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ErrorDetails extends CustomizedResponseEntityExceptionHandler {

    // timestamp
    private LocalDateTime timestamp;
    // message
    private String message;
    // details
    private String details;

    public ErrorDetails(LocalDateTime timestamp, String message, String details) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }
}

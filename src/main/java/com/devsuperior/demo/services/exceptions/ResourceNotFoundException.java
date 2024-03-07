package com.devsuperior.demo.services.exceptions;

import java.time.Instant;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String message) {
        super(message);
    }
}

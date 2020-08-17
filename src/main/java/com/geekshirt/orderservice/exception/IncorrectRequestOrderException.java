package com.geekshirt.orderservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class IncorrectRequestOrderException extends RuntimeException {
    public IncorrectRequestOrderException(String message) {
        super(message);
    }
}

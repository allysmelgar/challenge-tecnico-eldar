package com.ejercicio1.exceptions;

public class OperacionValidaException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public OperacionValidaException(String message) {
        super(message);
    }

    public OperacionValidaException(String message, Throwable cause) {
        super(message, cause);
    }
}

package com.ejercicio1.exceptions;

public class TarjetaValidaException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public TarjetaValidaException(String message) {
        super(message);
    }

    public TarjetaValidaException(String message, Throwable cause) {
        super(message, cause);
    }
}

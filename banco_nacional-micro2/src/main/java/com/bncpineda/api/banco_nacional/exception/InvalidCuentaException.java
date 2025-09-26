package com.bncpineda.api.banco_nacional.exception;

/**
 * @author Marco
 * @date 9/25/2025
 */
public class InvalidCuentaException extends RuntimeException
{
    public InvalidCuentaException(String message) {
        super(message);
    }
}

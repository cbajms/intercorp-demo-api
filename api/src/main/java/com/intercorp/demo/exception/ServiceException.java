package com.intercorp.demo.exception;

import org.springframework.http.HttpStatus;

public class ServiceException extends RuntimeException{
    private static final long serialVersionUID = -145863996021574775L;
    private final HttpStatus code;

    public ServiceException(final String message) {
        super(message);
        code = HttpStatus.INTERNAL_SERVER_ERROR;
    }

    public ServiceException(final String message, final Throwable cause) {
        super(message,cause);
        code = HttpStatus.INTERNAL_SERVER_ERROR;
    }

    public ServiceException(final String message, final HttpStatus code) {
        super(message);
        this.code = code;
    }

    public ServiceException(final String message, final Throwable cause, final HttpStatus code) {
        super(message,cause);
        this.code = code;
    }

    public HttpStatus getCode() {
        return code;
    }
}

package com.intercorp.demo.exception;

public class NotFoundException extends ServiceException {
    private static final long serialVersionUID = 360505640091569574L;

    public NotFoundException(final String message) {
        super(message);
    }

    public NotFoundException(final String message, final Throwable cause) {
        super(message,cause);
    }
}

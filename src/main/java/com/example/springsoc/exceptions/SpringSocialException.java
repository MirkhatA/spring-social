package com.example.springsoc.exceptions;

public class SpringSocialException extends RuntimeException {
    public SpringSocialException(String exMessage, Exception exception) {
        super(exMessage, exception);
    }

    public SpringSocialException(String exMessage) {
        super(exMessage);
    }
}

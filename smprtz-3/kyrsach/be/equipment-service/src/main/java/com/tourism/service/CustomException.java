package com.tourism.service;

public class CustomException extends Exception {
    public String mes;

    public CustomException(String message) {
        super(message);
        mes = message;
    }
}

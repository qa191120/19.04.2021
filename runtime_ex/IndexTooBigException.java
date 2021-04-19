package com.example;

public class IndexTooBigException extends RuntimeException {
    public IndexTooBigException(String message) {
        super(message);
    }
}

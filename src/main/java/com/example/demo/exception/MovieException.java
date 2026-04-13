package com.example.demo.exception;

public class MovieException extends RuntimeException {

    public MovieException(int id) {
        super( id + "not found");
    }
}
package com.example.demo.exceptions;

public class NoProductFoundException extends RuntimeException{
    public NoProductFoundException(String message){
        super(message);
    }
}
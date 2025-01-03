package com.example.demo.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String name) {
        super("User not found with name: " + name);
    }

    public UserNotFoundException(Long id) {
        super("User not found with id: " + id);
    }
}

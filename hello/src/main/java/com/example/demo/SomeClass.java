package com.example.demo;
public class SomeClass {
    
    private String message;

    // Getter and Setter for the message property
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void someMethod() {
        System.out.println("Your message: " + getMessage());
    }
}

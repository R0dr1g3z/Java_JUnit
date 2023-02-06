package com.example;

public class Exception {
    
    public static void printMessage(String message){
        if (message == null){
            throw new IllegalArgumentException();
        } else {
            System.out.println(message);
        }
    }
}

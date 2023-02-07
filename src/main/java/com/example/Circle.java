package com.example;

public class Circle {
    
    public static double circleArea(double r){
        if (r < 0){
            throw new IllegalArgumentException();
        }
        return Math.PI * Math.pow(r, 2);
    }
}

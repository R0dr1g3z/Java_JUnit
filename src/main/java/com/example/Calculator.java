package com.example;

public class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static boolean greater(int a, int b) {
        return a > b;
    }

    public static int factorial(int number){
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static double delta(int a, int b, int c){
        return Math.pow(b, 2) - 4 * a * c;
    }
}

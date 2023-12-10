package com.hillel.homework.lesson3;

public class Task2 {

    public static void main(String[] args) {

        double a = 10;
        double b = 20;
        double c = 30;

        int exponent = 3;

        double absDiff = Math.abs(a - b);
        double powSum = Math.pow((a + b), exponent);
        double sqrtC = Math.sqrt(c);

        double result = absDiff / (powSum - sqrtC);
        System.out.println("Result: " + result);
    }

}

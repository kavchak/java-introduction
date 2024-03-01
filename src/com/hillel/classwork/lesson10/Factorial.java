package com.hillel.classwork.lesson10;

public class Factorial {

    public static void main(String[] args) {

        /*
        5!
        1 * 2 * 3 * 4 * 5
        */

        System.out.println(factorial(5));
    }

    public static int factorial(int number) {
        if (number == 1) {
            return number;
        }
        return number * factorial(number - 1);
    }
}

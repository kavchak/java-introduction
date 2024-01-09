package com.hillel.homework.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {

    private static final String FIRST_NUMBER = "first number";
    private static final String SECOND_NUMBER = "second number";

    public static void main(String[] args) throws IOException {

        int number1 = getNumber(FIRST_NUMBER);
        char operator = getOperator();
        int number2 = getNumber(SECOND_NUMBER);

        double result = calculateResult(number1, operator, number2);

        System.out.println("Calculation result: " + result);
    }

    public static int getNumber(String numberOrder) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the " + numberOrder + ": ");

        return Integer.parseInt(reader.readLine());
    }

    public static char getOperator() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter action operator (+, -, *, /): ");

        return reader.readLine().charAt(0);
    }

    public static double calculateResult(int number1, char operator, int number2) {
        switch (operator) {
            case '+':
                return number1 + number2;
            case '-':
                return number1 - number2;
            case '*':
                return number1 * number2;
            case '/':
                if (number2 != 0) {
                    return (double) number1 / number2;
                } else {
                    System.out.println("Error: division by zero!");
                    return 0;
                }
            default:
                System.out.println("Error: invalid operation!");
                return 0;
        }
    }
}

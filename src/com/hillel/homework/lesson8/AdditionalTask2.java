package com.hillel.homework.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AdditionalTask2 {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Please enter a random 4-digit pin code: ");
        int inputPin = Integer.parseInt(READER.readLine());

        int iterations = findPinCode(inputPin);
        System.out.println("Number of iterations for guessing pin code by the program: " + iterations);
    }

    private static int findPinCode(int inputPin) {
        int[] inputPinArray = convertIntToArray(inputPin);
        int[] guessPinArray = new int[inputPinArray.length];
        int attempts = 0;

        while (convertArrayToNumber(guessPinArray) != inputPin) {
            attempts = pinMatchAttempts(guessPinArray, inputPinArray);
        }

        System.out.println("Pin code found: " + convertArrayToString(guessPinArray));
        return attempts;
    }

    private static int[] convertIntToArray(int number) {
        int pinCodeSize = 4;
        int[] digitArray = new int[pinCodeSize];
        int divisor = 10;

        for (int i = digitArray.length - 1; i >= 0; i--) {
            digitArray[i] = number % divisor;
            number /= divisor;
        }

        return digitArray;
    }

    private static int convertArrayToNumber(int[] digitArray) {
        int number = 0;
        int multiplier = 10;

        for (int digit : digitArray) {
            number = number * multiplier + digit;
        }

        return number;
    }

    private static int pinMatchAttempts(int[] guessPinArray, int[] inputPinArray) {
        int tries = 0;

        for (int i = 0; i < guessPinArray.length; i++) {
            while (guessPinArray[i] != inputPinArray[i]) {
                tries++;
                guessPinArray[i]++;
            }
        }

        return tries;
    }

    private static String convertArrayToString(int[] arr) {
        String result = "";

        for (int i : arr) {
            result += i;
        }

        return result;
    }

}
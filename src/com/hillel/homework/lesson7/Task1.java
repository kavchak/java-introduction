package com.hillel.homework.lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

    private static final int MIN_RANGE_NUMBER = 0;
    private static final int MAX_RANGE_NUMBER = 10;
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int intRandomNumber = generateRandom(MIN_RANGE_NUMBER, MAX_RANGE_NUMBER);
        int input = getUserInput();

        while(input != intRandomNumber) {
            System.out.println("Your guess number " + input + " is not equal to what the computer came up with. Please try again!");
            input = getUserInput();
        }

        System.out.println("Congratulation! Your guess number " + input + " is equal to computer's number " + intRandomNumber);
    }

    public static int generateRandom(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    private static int getUserInput() throws IOException {
        System.out.print("Please enter your guess (range should be between " + MIN_RANGE_NUMBER + " and " + MAX_RANGE_NUMBER + "): ");
        return Integer.parseInt(READER.readLine());
    }
}

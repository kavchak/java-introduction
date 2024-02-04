package com.hillel.homework.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {

    private static final int BIG_ARRAY_SIZE = 20;
    private static final int SMALL_ARRAY_SIZE = 10;
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int[] bigArray = new int[BIG_ARRAY_SIZE];

        System.out.println("Please enter " + BIG_ARRAY_SIZE + " random numbers: ");
        for (int i = 0; i < bigArray.length; i++) {
            bigArray[i] = Integer.parseInt(READER.readLine());
        }

        int[] firstSmallArray = new int[SMALL_ARRAY_SIZE];
        int[] secondSmallArray = new int[SMALL_ARRAY_SIZE];

        for (int i = 0; i < SMALL_ARRAY_SIZE; i++) {
            firstSmallArray[i] = bigArray[i];
            secondSmallArray[i] = bigArray[i + SMALL_ARRAY_SIZE];
        }

        System.out.println("Big array: ");
        printArray(bigArray);

        System.out.println("First small array: ");
        printArray(firstSmallArray);

        System.out.println("Second small array: ");
        printArray(secondSmallArray);
    }

    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.println(value);
        }
    }
}
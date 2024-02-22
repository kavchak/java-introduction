package com.hillel.homework.lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task1 {

    private static final int ARRAY_SIZE = 7;
    private static final int MIN_RANGE_NUMBER = 0;
    private static final int MAX_RANGE_NUMBER = 9;
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int[] firstArray = new int[ARRAY_SIZE];
        fillArrayByRandom(firstArray, MIN_RANGE_NUMBER, MAX_RANGE_NUMBER);

        int[] secondArray = new int[ARRAY_SIZE];
        fillArrayByUser(secondArray);

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));

        int matchingCount = countMatchingElements(firstArray, secondArray);
        System.out.println("Number of elements in arrays that match: " + matchingCount);
    }

    public static void fillArrayByRandom(int[] numbers, int min, int max) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * (max - min + 1) + min);
        }
    }

    private static void fillArrayByUser(int[] secondArray) throws IOException {
        System.out.println("Please enter " + ARRAY_SIZE + " random numbers: ");
        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = Integer.parseInt(READER.readLine());
        }
    }

    public static int countMatchingElements(int[] array1, int[] array2) {
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == array2[i]) {
                count++;
            }
        }
        return count;
    }
}

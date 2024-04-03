package com.hillel.homework.algorithmicMinute;

import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {

        int[] array = {1, 2, 2, 4, 3};
        int targetNumber = 5;

        int[] result = findSumPair(array, targetNumber);

        if (result != null) {
            System.out.println("Result: " + Arrays.toString(result));
        } else {
            System.out.println("No such indices found");
        }
    }

    private static int[] findSumPair(int[] array, int targetNumber) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == targetNumber) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}

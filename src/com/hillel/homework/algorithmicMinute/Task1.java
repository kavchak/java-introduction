package com.hillel.homework.algorithmicMinute;

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        int shiftRightPositions = 2;
        int shiftLeftPositions = -2;

        System.out.println("Original array: " + Arrays.toString(array));

        int[] shiftedRightArray = shiftArray(array, shiftRightPositions);
        System.out.println("Shifted right by " + shiftRightPositions + " positions: " + Arrays.toString(shiftedRightArray));

        int[] shiftedLeftArray = shiftArray(array, shiftLeftPositions);
        System.out.println("Shifted left by " + shiftLeftPositions + " positions: " + Arrays.toString(shiftedLeftArray));
    }

    private static int[] shiftArray(int[] array, int shiftPositions) {
        int[] shiftedArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int newIndex = (i + shiftPositions);

            if (newIndex < 0) {
                newIndex += array.length;
            } else if (newIndex >= array.length) {
                newIndex -= array.length;
            }

            shiftedArray[newIndex] = array[i];
        }

        return shiftedArray;
    }
}

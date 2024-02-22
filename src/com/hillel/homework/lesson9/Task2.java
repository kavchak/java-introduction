package com.hillel.homework.lesson9;

import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {

        int[] numbers = {2, 0, 7, 0, 4, 0, 9};

        moveZeroesToBeginning(numbers);

        System.out.println(Arrays.toString(numbers));
    }

    public static void moveZeroesToBeginning(int[] numbers) {
        int zeroIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                if (i != zeroIndex) {
                    int temp = numbers[i];
                    numbers[i] = numbers[zeroIndex];
                    numbers[zeroIndex] = temp;
                }
                zeroIndex++;
            }
        }
    }
}
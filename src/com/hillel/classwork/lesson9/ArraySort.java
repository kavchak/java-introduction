package com.hillel.classwork.lesson9;

import java.util.Arrays;
import java.util.Collection;

public class ArraySort {

    public static void main(String[] args) {

        int[] numbers = new int[10000];
        fill(numbers);

        long start = System.currentTimeMillis();

//        bubbleSort(numbers);
//        Arrays.sort(numbers);

        long end = System.currentTimeMillis();

        System.out.println("Time: " + (end - start));
//        System.out.println(Arrays.toString(numbers));
    }

    public static void fill(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
    }

    // O(n^2)
    private static void bubbleSort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] > numbers[i]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }
    }
}

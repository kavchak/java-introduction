package com.hillel.homework.lesson10;

public class Task2 {

    public static void main(String[] args) {

        int[][] array = {
                {1, 2, -3},
                {-4,-5, 6},
                {-7, 8, 9}
        };

        printNegativeArrayElementsCellNumbers(array);
    }

    private static void printNegativeArrayElementsCellNumbers(int[][] array) {
        System.out.println("Cells with negative numbers: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < 0) {
                    System.out.println("[" + i + "][" + j + "]");
                }
            }
        }
    }
}

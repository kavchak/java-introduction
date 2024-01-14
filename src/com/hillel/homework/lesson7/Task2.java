package com.hillel.homework.lesson7;

public class Task2 {

    private static final int FIRST_UNLUCKY_NUMBER = 4;
    private static final int SECOND_UNLUCKY_NUMBER = 9;
    private static final int MIN_RANGE_NUMBER = 0;
    private static final int MAX_RANGE_NUMBER = 100;

    public static void main(String[] args) {

        for (int i = MIN_RANGE_NUMBER; i <= MAX_RANGE_NUMBER; i++) {
            if (isLuckyNumber(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isLuckyNumber(int number) {
        int remainderDivision = number % 10;

        return number != FIRST_UNLUCKY_NUMBER && number != SECOND_UNLUCKY_NUMBER && remainderDivision != FIRST_UNLUCKY_NUMBER && remainderDivision != SECOND_UNLUCKY_NUMBER;
    }
}

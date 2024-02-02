package com.hillel.classwork.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayReverse {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(READER.readLine());
        }

        for (int i = numbers.length - 1 ; i >= 0 ; i--) {
            System.out.println(numbers[i]);
        }
    }
}

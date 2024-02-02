package com.hillel.classwork.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("input array size: ");
        int[] numbers = new int[Integer.parseInt(READER.readLine())];

//        int num = numbers[0];
//        System.out.println(num);
//
//        System.out.println(numbers[4]);
//
//        numbers[3] = 500;
//        System.out.println(numbers[3]);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("input " + i + " element: ");
            numbers[i] = Integer.parseInt(READER.readLine());
        }

        printArray(numbers);

        System.out.println(numbers);

    }

    public static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i + " element: " + numbers[i]);
        }
    }

}

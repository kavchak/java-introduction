package com.hillel.homework.lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Please enter the number for which the factorial will be calculated: ");
        int number = Integer.parseInt(READER.readLine());

        System.out.println(factorial(number));
    }

    public static long factorial(int number) {
        if (number == 1) {
            return number;
        }
        return number * factorial(number - 1);
    }
}

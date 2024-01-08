package com.hillel.classwork.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfElse {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("enter a number: ");

        int number = Integer.parseInt(reader.readLine());
        System.out.println("number: " + number);

        if (number > 100) {
            System.out.println("bigger than 100");
        }

        if (number >= 20 && number < 30) {
            System.out.println("your number is between 20 and 30");
        } else if (number > 10 && number < 20) {
            System.out.println("between 10 and 20");
        } else if (number > 5 && number < 10) {
            System.out.println("between 5 and 10");
        } else {
            System.out.println("else");
        }
    }
}

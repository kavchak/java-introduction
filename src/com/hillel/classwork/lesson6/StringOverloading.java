package com.hillel.classwork.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringOverloading {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        String test = READER.readLine();
        String test2 = READER.readLine();

        printConcatenation(test, test2);
        printConcatenation(test, "any text");
        printConcatenation("something", test);
        printConcatenation("1", "2");
        printConcatenation(READER.readLine(), READER.readLine());

        printConcatenation("test", 1);
    }

    public static void printConcatenation(String s1, String s2) {
        System.out.println(s1 + s2);
    }

    public static void printConcatenation(String str, int number) {
        System.out.println(str + number);
    }

}

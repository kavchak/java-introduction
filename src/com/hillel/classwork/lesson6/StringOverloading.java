package com.hillel.classwork.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringOverloading {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String test = bufferedReader.readLine();
        String test2 = bufferedReader.readLine();

        printConcatenation(test, test2);
        printConcatenation(test, "any text");
        printConcatenation("something", test);
        printConcatenation("1", "2");
        printConcatenation(bufferedReader.readLine(), bufferedReader.readLine());

        printConcatenation("test", 1);
    }

    public static void printConcatenation(String s1, String s2) {
        System.out.println(s1 + s2);
    }

    public static void printConcatenation(String str, int number) {
        System.out.println(str + number);
    }

}

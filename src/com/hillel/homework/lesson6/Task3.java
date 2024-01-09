package com.hillel.homework.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {

    public static final int APPLES_PER_BIG_JAR = 5;
    public static final int APPLES_PER_MIDDLE_JAR = 3;
    public static final int APPLES_PER_SMALL_JAR = 1;

    public static void main(String[] args) throws IOException {

        int apples = getApples();

        int bigJars = apples / APPLES_PER_BIG_JAR;
        int applesLeftAfterBigJars = apples % APPLES_PER_BIG_JAR;

        int middleJars = applesLeftAfterBigJars / APPLES_PER_MIDDLE_JAR;
        int applesLeftAfterMiddleJars = applesLeftAfterBigJars % APPLES_PER_MIDDLE_JAR;

        int smallJars = applesLeftAfterMiddleJars / APPLES_PER_SMALL_JAR;

        printResult(bigJars, middleJars, smallJars);
    }

    public static int getApples() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть кількість яблук: ");

        return Integer.parseInt(reader.readLine());
    }

    public static void printResult(int bigJars, int middleJars, int smallJars) {
        System.out.println("Великих банок - " + bigJars);
        System.out.println("Середніх банок - " + middleJars);
        System.out.println("Маленьких банок - " + smallJars);
    }
}
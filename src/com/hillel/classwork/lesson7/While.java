package com.hillel.classwork.lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class While {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        /**
         * Зчитати з консолі числа, доки юзер не напише сума
         * Після вводу слова сума, треба вивести в консоль суму всіх введених чисел
         */

        String input = READER.readLine();
        while(!input.equalsIgnoreCase("stop")) {
            System.out.println("your input: " + input);
            input = READER.readLine();
        }

    }

}

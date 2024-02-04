package com.hillel.homework.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Введіть фразу: ");
        String inputText = READER.readLine();

        System.out.println("Фраза " + inputText + " це паліндром? " + isPalindrome(inputText));
    }

    public static String isPalindrome(String inputText) {
        String textWithoutSpaces = inputText.replace(" ", "");

        char[] chars = new char[textWithoutSpaces.length()];

        for (int i = 0; i < textWithoutSpaces.length(); i++) {
            chars[i] = textWithoutSpaces.charAt(i);
        }

        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (chars[left] != chars[right]) {
                return "Ні";
            }
            left++;
            right--;
        }

        return "Taк";
    }
}
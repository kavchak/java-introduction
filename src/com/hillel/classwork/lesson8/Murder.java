package com.hillel.classwork.lesson8;

public class Murder {

    public static void main(String[] args) {

        int[] values = {1, 20, 56, 3, 10, 2, 89, 0, 99, 34};

        int index = 0;
        int max = values[index];
        for (int i = 0 ; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
                index = i + 1;
            }
        }

        System.out.println(index + " murder " + max);
    }
}

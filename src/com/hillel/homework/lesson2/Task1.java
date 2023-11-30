package com.hillel.homework.lesson2;

public class Task1 {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println();

        int tempValue = a;
        a = b;
        b = tempValue;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

}

package com.hillel.homework.lesson8;

public class AdditionalTask1 {

    public static void main(String[] args) {

        System.out.println("Квадрат із '*' 10x10:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Прямокутний трикутник з '#' 10x10:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
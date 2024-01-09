package com.hillel.homework.lesson6;

public class Task1 {

    public static void main(String[] args) {

        double randomNumber1 = Math.random();
        double randomNumber2 = Math.random();
        double randomNumber3 = Math.random();

        System.out.println("Random numbers: " + randomNumber1 + ", " + randomNumber2 + ", " + randomNumber3);

        double minNumber = getMinNumber(randomNumber1, randomNumber2, randomNumber3);

        System.out.println("Minimum number: " + minNumber);
    }

    public static double getMinNumber(double randomNumber1, double randomNumber2, double randomNumber3) {
        if (randomNumber1 <= randomNumber2 && randomNumber1 <= randomNumber3) {
            return randomNumber1;
        } else if (randomNumber2 <= randomNumber1 && randomNumber2 <= randomNumber3) {
            return randomNumber2;
        } else {
            return randomNumber3;
        }
    }
}

package com.hillel.classwork.lesson3;

public class JavaMath {

    public static void main(String[] args) {
        System.out.println(Math.PI);

        System.out.println(Math.sqrt(Math.PI));
        System.out.println(Math.sqrt(9));
        System.out.println(Math.pow(2, 8));

        float fl = 45.87f;
        System.out.println(Math.round(fl));
        System.out.println(Math.round(45.34));

        double random = Math.random();
        System.out.println("random " + random);

        int max = 50;
        int intRandom = (int) (random * max);
        System.out.println("random int" + intRandom);

        int r = (int) (-50 + random * 100);
        System.out.println("random in range " + r);

        int min = -50;
        int r2 = (int) ((random * (max - min)) + min);
        System.out.println(r2);
    }

}

package com.hillel.classwork.lesson7;

public class Bomb {

    public static void main(String[] args) throws InterruptedException {

        int i = 10;
        do {
            System.out.println("До вибуху залишилось " +  i + " сек" );
            Thread. sleep(1000);
            i--;

            if (i == 5) break;

        } while (i >= 0);

        if (i == 0) {
            System.out.println("Boom!!!");
        } else {
            System.out.println();
        }

    }

}

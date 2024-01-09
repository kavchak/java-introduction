package com.hillel.classwork.lesson6;

public class Castle {

    public static void main(String[] args) {

        int start = 1000;
        int end = 1500;

        int distance =  1200;

         boolean result = isHit(distance, start, end);

        System.out.println("потрапив? - " + result);

        System.out.println("потрапив? - " + isHit2(600, 1000, 1200));
        System.out.println("потрапив? - " + isHit2(600, 1000, 800));
        System.out.println("потрапив? - " + isHit2(600, 1000, 500));

    }

    private static boolean isHit(int distance, int start, int end) {
        if (distance < start || distance > end) {
            return false;
        } else {
            return true;
        }
    }

    private static boolean isHit2(int distance, int start, int end) {
        if (distance >= start && distance <= end) {
            return true;
        } else {
            return false;
        }
    }
}

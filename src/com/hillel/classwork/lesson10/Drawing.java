package com.hillel.classwork.lesson10;

public class Drawing {

    public static void main(String[] args) {

//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        String str = "*";
        for (int i = 0; i < 10; i++) {
            System.out.println(str);
            str = str + "*";
        }
    }
}

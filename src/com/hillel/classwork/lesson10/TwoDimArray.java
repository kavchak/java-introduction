package com.hillel.classwork.lesson10;

public class TwoDimArray {

    public static void main(String[] args) {

        int [][] arr = new int[2][3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i + j;
                System.out.print("(" + i + ", " + j + "): has value " + arr[i][j] + "; ");
            }
            System.out.println();
        }
    }
}

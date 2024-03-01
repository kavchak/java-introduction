package com.hillel.classwork.lesson10;

public class ThreeDimArray {

    public static void main(String[] args) {

        boolean [][][] arr = new boolean[4][5][10];

        arr[0][2][7] = true;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("level " + i);
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
        }
    }
}

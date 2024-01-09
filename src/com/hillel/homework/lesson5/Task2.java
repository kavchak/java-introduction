package com.hillel.homework.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {

    private static final int ALLOWED_BAG_WIDTH = 55;
    private static final int ALLOWED_BAG_HEIGHT = 40;
    private static final int ALLOWED_BAG_DEPTH = 20;

    private static final int ALLOWED_SUITCASE_WIDTH = 40;
    private static final int ALLOWED_SUITCASE_HEIGHT = 53;
    private static final int ALLOWED_SUITCASE_DEPTH = 22;

    public static void main(String[] args) throws IOException {

        int width = getDimensionsParameters("width");
        int height = getDimensionsParameters("height");
        int depth = getDimensionsParameters("depth");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Select the type of the luggage (1 - bag or backpack, 2 - suitcase): ");

        int luggageType = Integer.parseInt(reader.readLine());

        switch (luggageType) {
            case 1:
                checkBagDimensions(width, height, depth);
                break;
            case 2:
                checkSuitcaseDimensions(width, height, depth);
                break;
            default:
                System.out.println("Unknown luggage type");
                break;
        }
    }

    public static int getDimensionsParameters(String parameter) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the " + parameter + " of the luggage (should be a number): ");

        return Integer.parseInt(reader.readLine());
    }

    private static void checkBagDimensions(int width, int height, int depth) {
        boolean isBagValid = comparisonLuggageSizes(width, height, depth, ALLOWED_BAG_WIDTH, ALLOWED_BAG_HEIGHT, ALLOWED_BAG_DEPTH);

        if (isBagValid) {
            System.out.println("Your bag or backpack is suitable for carry-on luggage");
        } else {
            System.out.println("Your bag or backpack is not suitable for carry-on luggage");
        }
    }

    private static void checkSuitcaseDimensions(int width, int height, int depth) {
        boolean isSuitcaseValid = comparisonLuggageSizes(width, height, depth, ALLOWED_SUITCASE_WIDTH, ALLOWED_SUITCASE_HEIGHT, ALLOWED_SUITCASE_DEPTH);

        if (isSuitcaseValid) {
            System.out.println("Your suitcase is suitable for carry-on luggage");
        } else {
            System.out.println("Your suitcase is not suitable for carry-on luggage");
        }
    }

    private static boolean comparisonLuggageSizes(int width, int height, int depth, int allowedWidth, int allowedHeight, int allowedDepth) {
        return width <= allowedWidth && height <= allowedHeight && depth <= allowedDepth;
    }
}
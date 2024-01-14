package com.hillel.homework.lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AdditionalTask {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int numberOfCars = getUserInput();

        carWashWithFor(numberOfCars);
        carWashWithWhile(numberOfCars);
    }

    private static int getUserInput() throws IOException {
        System.out.print("Please enter the number of cars to be washed: ");
        return Integer.parseInt(READER.readLine());
    }

    private static void carWashWithFor(int numberOfCars) {
        System.out.println("Washing cars using the 'For' loop:");
        for (int i = 1; i <= numberOfCars; i++) {
            soapCar(i);
            washCar(i);
            dryCar(i);
        }
        printAllCarsWashed();
    }

    private static void carWashWithWhile(int numberOfCars) {
        System.out.println("Washing cars using the 'While' loop:");
        int i = 1;
        while (i <= numberOfCars) {
            soapCar(i);
            washCar(i);
            dryCar(i);
            i++;
        }
        printAllCarsWashed();
    }

    private static void soapCar(int carNumber) {
        System.out.println("Soaped car №" + carNumber);
    }

    private static void washCar(int carNumber) {
        System.out.println("Washed car №" + carNumber);
    }

    private static void dryCar(int carNumber) {
        System.out.println("Dried car №" + carNumber);
    }

    private static void printAllCarsWashed() {
        System.out.println("All cars are washed!");
    }
}

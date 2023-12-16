package com.hillel.homework.lesson4;

import java.util.Scanner;

public class AdditionalTask {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input distance in kilometers: ");
        int distance = scanner.nextInt();

        System.out.println("Input the amount of gasoline consumed in liters: ");
        int fuelConsumption = scanner.nextInt();

        double fuelConsumptionPerOneHundredKm = getFuelConsumptionPerOneHundredKm(distance, fuelConsumption);
        System.out.println("Fuel consumption per 100 km: " + fuelConsumptionPerOneHundredKm);

        scanner.close();
    }

    public static double getFuelConsumptionPerOneHundredKm(int distance, int fuelConsumption) {
        int oneHundredKm = 100;
        return ((double) fuelConsumption / distance) * oneHundredKm;
    }
}

package com.hillel.homework.lesson15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TemperatureConversionMain {

    enum TemperatureScale {
        KELVIN,
        FAHRENHEIT
    }

    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        double celsius = getCelsiusTemperature();
        TemperatureScale scale = getConversionType();
        convertTemperature(scale, celsius);
    }

    private static double getCelsiusTemperature() {
        try {
            System.out.print("Enter temperature in Celsius: ");
            return Double.parseDouble(READER.readLine());
        } catch (Exception exception) {
            System.out.println("Please enter a number. Error: " + exception.getMessage());
            return getCelsiusTemperature();
        }
    }

    private static TemperatureScale getConversionType() {
        try {
            System.out.println("Please enter a conversion type (1 - Kelvin, 2 - Fahrenheit): ");
            int choice = Integer.parseInt(READER.readLine());
            switch (choice) {
                case 1:
                    return TemperatureScale.KELVIN;
                case 2:
                    return TemperatureScale.FAHRENHEIT;
                default:
                    System.out.println("Invalid input. Please enter 1 or 2.");
                    return getConversionType();
            }
        } catch (Exception exception) {
            System.out.println("Please enter a number 1 or 2. Error: " + exception.getMessage());
            return getConversionType();
        }
    }

    private static void convertTemperature(TemperatureScale scale, double celsius) {
        switch (scale) {
            case KELVIN:
                double celsiusToKelvinResult = new KelvinConverter().convert(celsius);
                System.out.println(celsius + " degrees Celsius is equal to " + celsiusToKelvinResult + " Kelvin.");
                break;
            case FAHRENHEIT:
                double celsiusToFahrenheitResult = new FahrenheitConverter().convert(celsius);
                System.out.println(celsius + " degrees Celsius is equal to " + celsiusToFahrenheitResult + " Fahrenheit.");
                break;
            default:
                throw new IllegalArgumentException("Unsupported temperature scale: " + scale);
        }
    }
}

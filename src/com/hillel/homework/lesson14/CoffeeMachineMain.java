package com.hillel.homework.lesson14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CoffeeMachineMain {

    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {

        ArrayList<Drink> drinks = new ArrayList<>();
        orderDrinks(drinks);
        printOrder(drinks);
        prepareDrinks(drinks);
    }

    private static void orderDrinks(ArrayList<Drink> drinks) {
        boolean ordering = true;

        while (ordering) {
            int choice = getDrinkNumber();

            if (choice == 0) {
                ordering = false;
            }

            Drink drink = createDrink(choice);
            if (drink != null) {
                drinks.add(drink);
            }
        }
    }

    private static Integer getDrinkNumber() {
        try {
            System.out.println("Please choose a drink (1 - americano, 2 - latte, 3 - cappuccino, 4 - tea, 0 - to submit): ");
            return Integer.parseInt(READER.readLine());
        } catch (Exception exception) {
            System.out.println("Please enter a number. Error: " + exception.getMessage());
            return getDrinkNumber();
        }
    }

    private static Drink createDrink(int choice) {
        switch (choice) {
            case 1:
                return new Americano();
            case 2:
                return new Latte();
            case 3:
                return new Cappuccino();
            case 4:
                return new Tea();
            default:
                if (choice != 0) System.out.println("Wrong choice of drink!");
                return null;
        }
    }

    private static void printOrder(ArrayList<Drink> drinks) {
        double totalCost = 0;
        System.out.println();
        for (Drink drink : drinks) {
            System.out.println(drink.getType() + ": " + drink.getPrice() + " UAH");
            totalCost += drink.getPrice();
        }
        System.out.println("-----------------------");
        System.out.println("Total: " + totalCost + " UAH");
        System.out.println();
    }

    private static void prepareDrinks(ArrayList<Drink> drinks) {
        for (Drink drink : drinks) {
            drink.prepare();
        }
    }
}

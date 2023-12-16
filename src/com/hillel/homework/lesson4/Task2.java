package com.hillel.homework.lesson4;

public class Task2 {

    public static void main(String[] args) {

        int dogs = 24;
        int cats = 8;
        int mealPortionWeightInGrams = 50;
        int mealPortionCost = 2;
        int mealsPerDay = 3;

        int daysInMonth = 30;
        int gramsPerKilogram = 1000;
        double costPerGram = (double) mealPortionCost / mealPortionWeightInGrams;

        double monthlyCatsFood = getMonthlyAnimalsFoodAmount(cats, mealPortionWeightInGrams, mealsPerDay, daysInMonth, gramsPerKilogram);
        double monthlyDogsFood = getMonthlyAnimalsFoodAmount(dogs, mealPortionWeightInGrams, mealsPerDay, daysInMonth, gramsPerKilogram);
        double monthlyShelterExpenses = getMonthlyShelterExpenses(monthlyCatsFood, monthlyDogsFood, costPerGram, gramsPerKilogram);
        
        printMessage(monthlyCatsFood, monthlyDogsFood, monthlyShelterExpenses);
    }

    public static double getMonthlyAnimalsFoodAmount(int animalsCount, int lunchPortionWeight, int mealsPerDay, int daysInMonth, float gramsPerKilogram) {
        return (animalsCount * lunchPortionWeight * mealsPerDay * daysInMonth) / gramsPerKilogram;
    }

    public static double getMonthlyShelterExpenses(double monthlyCatsFood, double monthlyDogsFood, double costPerGram, int gramsPerKilogram) {
        return (monthlyCatsFood + monthlyDogsFood) * gramsPerKilogram * costPerGram;
    }

    public static void printMessage(double monthlyCatsFood, double monthlyDogsFood, double monthlyShelterExpenses) {
        System.out.println("I need food for cats per month: " + monthlyCatsFood + " kg.");
        System.out.println("I need food for dogs per month:: " + monthlyDogsFood + " kg.");
        System.out.println("I need money per month to maintain the shelter: $" + monthlyShelterExpenses);
    }
}

package com.hillel.homework.lesson14;

public class PropertyTaxCalculatorMain {

    public static void main(String[] args) {

        ResidentialProperty residentialProperty = new ResidentialProperty(50, 2, 20);
        CommercialProperty commercialProperty = new CommercialProperty(300, 10, 150);
        IndustrialProperty industrialProperty = new IndustrialProperty(600, 15);

        printTax("Residential property", residentialProperty);
        printTax("Commercial property", commercialProperty);
        printTax("Industrial property", industrialProperty);
    }

    private static void printTax(String propertyName, Property property) {
        System.out.println(propertyName + " tax: " + property.calculateTax() + " UAH");
    }
}

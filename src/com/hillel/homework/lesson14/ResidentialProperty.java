package com.hillel.homework.lesson14;

public class ResidentialProperty extends Property {

    private static final double HUNDRED_PERCENT = 100.0;
    private final double subsidyPercent;

    public ResidentialProperty(double area, double taxPerSquareMeter, double subsidyPercent) {
        super(area, taxPerSquareMeter);
        this.subsidyPercent = subsidyPercent;
    }

    @Override
    public double calculateTax() {
        return super.calculateTax() * ((HUNDRED_PERCENT - subsidyPercent) / HUNDRED_PERCENT);
    }
}

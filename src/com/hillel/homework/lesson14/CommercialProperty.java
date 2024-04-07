package com.hillel.homework.lesson14;

public class CommercialProperty extends Property {

    private static final double MIN_REVENUE_FOR_TAX = 100;
    private static final double DEFAULT_TAX_AMOUNT = 0;
    private final double revenue;

    public CommercialProperty(double area, double taxPerSquareMeter, double revenue) {
        super(area, taxPerSquareMeter);
        this.revenue = revenue;
    }

    @Override
    public double calculateTax() {
        return revenue >= MIN_REVENUE_FOR_TAX ? super.calculateTax() : DEFAULT_TAX_AMOUNT;
    }
}

package com.hillel.homework.lesson14;

public class Property {

    protected final double area;
    protected final double taxPerSquareMeter;

    public Property(double area, double taxPerSquareMeter) {
        this.area = area;
        this.taxPerSquareMeter = taxPerSquareMeter;
    }

    public double calculateTax() {
        return area * taxPerSquareMeter;
    }

}
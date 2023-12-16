package com.hillel.classwork.lesson4;

public class Salary {

    public static void main(String[] args) {

        int employeeFirstSalaryPerMonth = 3000;
        int employeeSecondSalaryPerMonth = 4500;
        int employeeThirdSalaryPerMonth = 5800;

        int monthsInYear = 12;
        int yearsPeriod = 10;

        int employeeFirstSalaryForTenYears = employeeFirstSalaryPerMonth * monthsInYear * yearsPeriod;
        int employeeSecondSalaryForTenYears = employeeSecondSalaryPerMonth * monthsInYear * yearsPeriod;
        int employeeThirdSalaryForTenYears = employeeThirdSalaryPerMonth * monthsInYear * yearsPeriod;
        System.out.println("Employee salary for ten years: " + employeeFirstSalaryForTenYears + ", " + employeeSecondSalaryForTenYears + ", " + employeeThirdSalaryForTenYears);

        double taxSize = 0.05;

        double employeeFirstTax = employeeFirstSalaryForTenYears * taxSize;
        double employeeSecondTax = employeeSecondSalaryForTenYears * taxSize;
        double employeeThirdTax = employeeThirdSalaryForTenYears * taxSize;
        System.out.println("Employee tax: " + employeeFirstTax + ", " + employeeSecondTax + ", " + employeeThirdTax);

        double employeeFirstAverageSalaryWithoutTax = (employeeFirstSalaryForTenYears - employeeFirstTax) / yearsPeriod;
        double employeeSecondAverageSalaryWithoutTax = (employeeSecondSalaryForTenYears - employeeSecondTax) / yearsPeriod;
        double employeeThirdAverageSalaryWithoutTax = (employeeThirdSalaryForTenYears - employeeThirdTax) / yearsPeriod;
        System.out.println("Employees average salary without tax: " + employeeFirstAverageSalaryWithoutTax + ", " + employeeSecondAverageSalaryWithoutTax + ", " + employeeThirdAverageSalaryWithoutTax);
    }
}

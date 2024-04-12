package com.hillel.homework.lesson15;

class FahrenheitConverter implements Converter {
    @Override
    public double convert(double celsius) {
        return (celsius * 9/5) + 32;
    }
}

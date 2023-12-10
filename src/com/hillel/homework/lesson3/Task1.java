package com.hillel.homework.lesson3;

public class Task1 {

    public static void main(String[] args) {

        double firstSnowBallRadius = 1;
        double secondSnowBallRadius = 0.5;
        double thirdSnowBallRadius = 0.2;
        double snowBallsDensityCoefficient = 0.7;

        double volumeMultiplierFraction = 4.0 / 3.0;
        int exponent = 3;

        double firstSnowBallVolume = volumeMultiplierFraction * Math.PI * Math.pow(firstSnowBallRadius, exponent);
        double secondSnowBallVolume = volumeMultiplierFraction * Math.PI * Math.pow(secondSnowBallRadius, exponent);
        double thirdSnowBallVolume = volumeMultiplierFraction * Math.PI * Math.pow(thirdSnowBallRadius, exponent);

        double snowBallsTotalVolume = firstSnowBallVolume + secondSnowBallVolume + thirdSnowBallVolume;
        double snowmanWeight = snowBallsDensityCoefficient * snowBallsTotalVolume;
        System.out.println("Snowman weight: " + snowmanWeight + " kg." );
    }

}

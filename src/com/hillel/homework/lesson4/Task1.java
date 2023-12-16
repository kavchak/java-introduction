package com.hillel.homework.lesson4;

public class Task1 {

    public static void main(String[] args) {

        String fighterType = "Jet";
        String fighterModel = "F-22 Raptor";
        printAirplaneInfo(fighterType, fighterModel);

        String aircraftFirstType = "Airliner";
        String aircraftFirstModel = "Airbus 737";
        int aircraftFirstEconomySeats = 120;
        printAirplaneInfo(aircraftFirstType, aircraftFirstModel, aircraftFirstEconomySeats);

        String aircraftSecondType = "Airliner";
        String aircraftSecondModel = "Boeing 777";
        int aircraftSecondEconomySeats = 180;
        int aircraftSecondBusinessSeats = 28;
        printAirplaneInfo(aircraftSecondType, aircraftSecondModel, aircraftSecondEconomySeats, aircraftSecondBusinessSeats);
    }

    public static void printAirplaneInfo(String fighterType, String fighterModel) {
        System.out.println("Aircraft type: " + fighterType + ", model: " + fighterModel + ",");
    }

    public static void printAirplaneInfo(String aircraftType, String aircraftModel, int economySeats) {
        System.out.println("Aircraft type: " + aircraftType + ", model: " + aircraftModel + ", number of economy class passengers: " + economySeats);
    }

    public static void printAirplaneInfo(String aircraftType, String aircraftModel, int economySeats, int businessSeats) {
        System.out.println("Aircraft type: " + aircraftType + ", model: " + aircraftModel + ", number of economy class passengers: " + economySeats + ", business class passengers: " + businessSeats);
    }
}

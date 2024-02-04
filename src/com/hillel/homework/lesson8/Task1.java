package com.hillel.homework.lesson8;

public class Task1 {

    private static final int TEAM_SIZE = 11;
    private static final int MIN_RANGE_NUMBER = 18;
    private static final int MAX_RANGE_NUMBER = 45;

    public static void main(String[] args) {

        int[] firstTeamAges = new int[TEAM_SIZE];
        int[] secondTeamAges = new int[TEAM_SIZE];

        addRandomPlayersAges(firstTeamAges);
        addRandomPlayersAges(secondTeamAges);

        System.out.println("First team players age: " + getAgesList(firstTeamAges));
        System.out.println("Second team players age: " + getAgesList(secondTeamAges));

        printTeamsAverageAgeComparisonResult(firstTeamAges, secondTeamAges);
    }

    public static void addRandomPlayersAges(int[] team) {
        for (int i = 0; i < team.length; i++) {
            team[i] = generateRandomPlayerAge(MIN_RANGE_NUMBER, MAX_RANGE_NUMBER);
        }
    }

    public static int generateRandomPlayerAge(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static String getAgesList(int[] team) {
        String agesList = "";

        for (int i = 0; i < team.length; i++) {
            agesList += team[i];

            if (i < team.length - 1) {
                agesList += ",";
            }
        }

        return agesList;
    }

    public static void printTeamsAverageAgeComparisonResult(int[] firstTeam, int[] secondTeam) {
        int firstTeamAverageAge = calcTeamAverageAge(firstTeam);
        int secondTeamAverageAge = calcTeamAverageAge(secondTeam);

        if (firstTeamAverageAge > secondTeamAverageAge) {
            System.out.println("The average age of the first team is bigger and equals " + firstTeamAverageAge);
        } else if (firstTeamAverageAge < secondTeamAverageAge) {
            System.out.println("The average age of the second team is bigger and equals " + secondTeamAverageAge);
        } else {
            System.out.println("The average age of both teams are equal: " + firstTeamAverageAge + " = " + secondTeamAverageAge);
        }
    }

    public static int calcTeamAverageAge(int[] team) {
        int teamTotalAges = 0;

        for (int age : team) {
            teamTotalAges += age;
        }

        return teamTotalAges / team.length;
    }
}
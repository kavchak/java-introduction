package com.hillel.homework.lesson12;

public class Person1Main {

    private static final int PEOPLE_COUNT = 100;

    public static void main(String[] args) {

        Person1[] people = generateRandomPeople(PEOPLE_COUNT);

        printPeopleInfo(people);
    }

    private static Person1[] generateRandomPeople(int count) {
        String[] firstNames = {"George", "Julia", "Thomas", "Anna", "Andrew", "Katherine", "John", "Mary", "Zachary", "Nancy"};
        String[] lastNames = {"Washington", "Adams", "Jefferson", "Madison", "Jackson", "Harrison", "Tyler", "Polk", "Taylor", "Fillmore"};

        Person1[] people = new Person1[count];
        for (int i = 0; i < count; i++) {
            String firstName = firstNames[generateRandom(0, firstNames.length)];
            String lastName = lastNames[generateRandom(0, lastNames.length)];
            int age = generateRandomAge();
            int weight = generateRandomWeight(age);
            int height = generateRandomHeight(age);

            people[i] = new Person1(firstName, lastName, age, weight, height);
        }

        return people;
    }

    private static int generateRandom(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }

    private static int generateRandomAge() {
        int minAge = 1;
        int maxAge = 80;

        return generateRandom(minAge, maxAge);
    }

    private static int generateRandomWeight(int age) {
        int minWeight = 1;
        int maxWeight = 120;
        int randomWeight;

        if (age <= 2) {
            maxWeight = 10;
            randomWeight = generateRandom(minWeight, maxWeight);
        } else if ( age <= 10) {
            minWeight = 11;
            maxWeight = 20;
            randomWeight = generateRandom(minWeight, maxWeight);
        } else if ( age <= 18) {
            minWeight = 21;
            maxWeight = 50;
            randomWeight = generateRandom(minWeight, maxWeight);
        } else {
            minWeight = 51;
            randomWeight = generateRandom(minWeight, maxWeight);
        }

        return randomWeight;
    }

    private static int generateRandomHeight(int age) {
        int minHeight;
        int maxHeight;

        if (age <= 2) {
            minHeight = 50;
            maxHeight = 100;
        } else if (age <= 10) {
            minHeight = 101;
            maxHeight = 149;
        } else {
            minHeight = 150;
            maxHeight = 200;
        }

        return generateRandom(minHeight, maxHeight);
    }

    private static void printPeopleInfo(Person1[] people) {
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }
    }
}

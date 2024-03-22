package com.hillel.classwork.lesson12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PersonController {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        String name = PersonController.READER.readLine();

        Person person = new Person(name, 18);

        System.out.println(person);

        processPerson(person);

        System.out.println(person.getAge());
        System.out.println(Person.DEFAULT_NAME);

        System.out.println(person);

        Person person1 = new Person(23);
        System.out.println(person1);
        System.out.println(person1.getName());

        Person.printCount();

        person1.setAge(43);
        System.out.println(person1.getAge());

    }

    public static void processPerson(Person person) {

    }
}

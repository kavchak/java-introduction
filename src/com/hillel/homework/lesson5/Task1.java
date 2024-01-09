package com.hillel.homework.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

    private static final String MATHEMATICS = "Mathematics";
    private static final String HISTORY = "History";
    private static final String PHILOSOPHY = "Philosophy";
    private static final String ECONOMICS = "Economics";
    private static final String SCIENCE = "Science";

    public static void main(String[] args) throws IOException {

        int mathGrade = getSubjectGrade(MATHEMATICS);
        int historyGrade = getSubjectGrade(HISTORY);
        int philosophyGrade = getSubjectGrade(PHILOSOPHY);
        int economicsGrade = getSubjectGrade(ECONOMICS);
        int scienceGrade = getSubjectGrade(SCIENCE);

        double numberOfSubjects = 5.0;

        double gradePointAverage = (mathGrade + historyGrade + philosophyGrade + economicsGrade + scienceGrade) / numberOfSubjects;
        System.out.println("Grade Point Average: " + gradePointAverage);

        if (gradePointAverage >= 10) {
            System.out.println("Student will receive an increased scholarship");
        } else if (gradePointAverage >= 8) {
            System.out.println("Student will receive a regular scholarship");
        } else {
            System.out.println("Student will not receive a scholarship");
        }
    }

    public static int getSubjectGrade(String subject) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter grades for " + subject + " (should be a number): ");

        return Integer.parseInt(reader.readLine());
    }
}

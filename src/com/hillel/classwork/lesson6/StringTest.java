package com.hillel.classwork.lesson6;

public class StringTest {

    public static void main(String[] args) {
        String s1 = "text";
        String s2 = s1;
        String s3 = "text";

        System.out.println(s1);
        System.out.println(s1.hashCode());

        System.out.println(s2);
        System.out.println(s2.hashCode());

        System.out.println(s3);
        System.out.println(s3.hashCode());

        System.out.println("Compare links:");
        System.out.println(s1 == s2 );

        System.out.println("Compare values:");
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s1));
        System.out.println("Text".equals(s2));
        System.out.println(s1.equals("t"));

        boolean result = !s1.equals(s2);
        if (!s1.equals(s2)) {
            System.out.println("Not equal");
        }
    }
}

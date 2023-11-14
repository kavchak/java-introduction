package com.hillel.classwork.lesson2;

public class Variables {

    public static void main(String[] args) {

        System.out.println("Variables:");

        byte myByte = 101;
        System.out.println("this is byte: " + myByte + "!" );

        short myShort = 30000;
        System.out.println("this is short: " + myShort);

        int result = myByte + myShort;
        System.out.println("this is result: " + result);

        int myInt = 454666676;
        System.out.println(myInt);

        long myLong = 1_000_000_000_000L;
        System.out.println(myLong);

        float myFloat = 38.889F;
        System.out.println(myFloat);

        double myDouble = 567667867878.8999898090;
        System.out.println(myDouble);

        boolean isValid = false;
        System.out.println(isValid);

        char myChar = '&';
        System.out.println(myChar);

        char myNumericChar = 56756 ;
        System.out.println(myNumericChar);

        char ch3 = '\u0054';
        System.out.println(ch3);

        String string = "test";
        System.out.println("this is string: " + string );

    }
}

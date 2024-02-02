package com.hillel.classwork.lesson8;

public class ArrayLink {

    public static void main(String[] args) {

        String[] strings = new String[3];

        fillArray(strings);

        printArray(strings);
        System.out.println("strings link " + strings);

        String[] anotherStrings = strings;
        System.out.println("anotherStrings link " + anotherStrings);

        anotherStrings[0] = "new text";
        System.out.println(strings[0]);
        System.out.println(anotherStrings [0]);

        String[] newStrings = createAndFill(10);
        printArray(newStrings);

    }

    public static void fillArray(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            strings[i] = "str" + i;
        }
    }

    public static void printArray(String[] strings) {
        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static String[] createAndFill(int size) {
         String[] strings = new String[size];
          fillArray(strings);
          return strings;
    }

}

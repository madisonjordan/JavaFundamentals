package com.codewithmosh.Section2Types.ReferenceType.String;

// STRINGS
public class Main {
    public static void main(String[] args) {
        // String message = new String("Hello World"); // don't need to use string object
        String msg = "Hello World"; // string literal

        // can concat strings
        String message = "  Hello World" + "!!  ";
        System.out.println(message.endsWith("!!"));

        // index of character
        System.out.println(message.indexOf("H"));
        System.out.println(message.indexOf("sky"));

        System.out.println(message.replace("!", "*"));

        System.out.println(message.toLowerCase());

        // remove leading and trailing whitespace
        System.out.println(message.trim());

        // original string does not change. Strings are immutable. new string object returned
        System.out.println(message);
    }
}

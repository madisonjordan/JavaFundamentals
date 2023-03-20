package com.codewithmosh.Section2Types.ReadingInput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner(System.in) - read from terminal input

        // get input as byte
        Scanner byteScanner = new Scanner(System.in);
        System.out.println("Age: ");
        byte age = byteScanner.nextByte();
        System.out.println("You are " + age);

        // get input as stringd
        Scanner stringScanner = new Scanner(System.in);
        System.out.println("Name: ");
        String name = stringScanner.nextLine().trim();
        System.out.println("You are " + name);
    }
}

package com.codewithmosh.Section2Types.Project;

import java.text.NumberFormat;
import java.util.Scanner;

// Mortgage Calculator
public class Main {
    public static void main(String[] args) {
        int principal = 0;
        double interestRate = 0;
        int period = 0;
        double result = 0;

        // get inputs from user for Principal, Annual Interest Rate, Period
        Scanner inputPrincipal = new Scanner(System.in);
        System.out.println("Principal: ");
        principal = inputPrincipal.nextInt();

        Scanner inputInterest = new Scanner(System.in);
        System.out.println("Annual Interest Rate: ");
        interestRate = inputInterest.nextDouble();

        Scanner inputPeriod = new Scanner(System.in);
        System.out.println("Period (Years): ");
        period = inputPeriod.nextInt();

        // calculate mortgage
        principal * interestRate / 100
        Math pow();



        // output mortgage calculation
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String mortgage = currency.format(result);
        System.out.println(mortgage);

    }
}

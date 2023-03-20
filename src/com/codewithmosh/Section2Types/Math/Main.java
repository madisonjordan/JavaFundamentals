package com.codewithmosh.Section2Types.Math;

import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        // ARITHMETIC EXPRESSIONS
        int quotient = 10 / 3;
        System.out.println(quotient);

        // pre-fix and post-fix operators
        int x = 1;
        int y = x++; // y = x, which is 1; then x++
        System.out.println(x); // x = 2
        System.out.println(y); // y = 1

        // Order of Operations
        // "PEMDAS"
        // P  ( )
        // E   =   (not used)
        // M   *
        // D   /
        // A   +
        // S   -

        //CASTING
        //Implicit casting
        //byte > short > int > long > float > double
        //You can only cast compatible types.
        double xDouble = 1.1;
        int yInt1 = (int)xDouble + 2;
        System.out.println(yInt1);

        String xString = "1";
        int yInt = Integer.parseInt(xString) + 2;
        System.out.println(yInt);

        // MATH CLASS

        // round
        int roundResult = Math.round(1.1F);
        System.out.println(roundResult);

        // ceiling and floor functions
        int resultCeil = (int)Math.ceil(1.1F); // 1.1 -> 2
        System.out.println(resultCeil);

        // generates a random number between 0 and 1
        double randomResult = Math.random();
        System.out.println(randomResult);

        // generate a random number between 0 and 100
        int randomResultRound = (int)Math.round(Math.random() * 100);
        System.out.println(randomResultRound);

        // FORMATTING NUMBERS

        // NumberFormat - abstract class
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String money = currency.format(1234567.891);
        System.out.println(money);

        NumberFormat percent = NumberFormat.getPercentInstance();
        String percentFormat = percent.format(0.1);
        System.out.println(percentFormat);

        // shortcut using method chaining
        String shortcut = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(shortcut);
    }
}

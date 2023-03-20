package com.codewithmosh.Section2Types.ReferenceType;

import java.awt.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date now = new Date();
        now.getTime();
        System.out.println(now);

        Point point1 = new Point(1, 1);
        Point point2 = point1; // same ref address in memory
        point1.x = 2;
        System.out.println(point2);




        // ARITHMETIC EXPRESSIONS
        int quotient = 10 / 3;

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







    }
}

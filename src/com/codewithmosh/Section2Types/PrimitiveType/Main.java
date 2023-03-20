package com.codewithmosh.Section2Types.PrimitiveType;

public class Main {
    public static void main(String[] args) {
        int myAge = 30;
        int herAge = myAge;
        int temperature = 20;
        System.out.println(herAge);

        // --------------- //
        // primitive types //
        // --------------- //
        byte age = 30;

        int viewsCount = 123_456_789; // underscores can be used for readability
        //long viewsCountLong = 3_123_456_789; // Java still thinks it's an integer
        long viewsCountLongFix = 3_123_456_789L;

        //float priceFloat = 10.99; // Java sees it as a double
        float priceFloatFix = 10.99F;

        char letter = 'A';

        boolean isEligible = false;
    }
}

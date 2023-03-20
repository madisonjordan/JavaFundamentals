package com.codewithmosh.Section2Types.ReferenceType.Array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // ARRAYS
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        // numbers[10] = 3; // ERROR

        // printing
        // System.out.println(numbers); // prints memory space
        System.out.println(Arrays.toString(numbers));

        // new initialization method
        // Java arrays have a fixed length you cannot change.
        int[] newNumbers = { 2, 3, 5, 1, 4};
        System.out.println(numbers.length);

        // sort array
        Arrays.sort(newNumbers);
        System.out.println(Arrays.toString(newNumbers));

        // MULTIDIMENSIONAL ARRAYS
        int[][] numbers2D = new int[2][3];
        // 2D array
        //     col  0   1   2
        // row 0 - [ ] [ ] [ ]
        // row 1 - [ ] [ ] [ ]
        numbers2D[0][0] = 1;
        System.out.println(Arrays.deepToString(numbers2D));

        // initializing array
        int[][] numbers2Dinit = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.deepToString(numbers2Dinit));

        // 3D array
        int[][][] numbers3D = new int[2][3][5];

    }
}

package com.company;

//import java.util.Arrays;

public class Main {

    // Exam. Q3
    public static boolean family(int[] arr) {
        return family(arr, arr.length);
    }

    public static boolean family(int[] a, int index) {
        if( index == 0 ) {
            return isFamilyMember(a[0]);
        } else {
            return isFamilyMember(a[index - 1]) && family(a, --index);
        }
    }

    public static boolean isFamilyMember(int number) {
        return  number % 2 == 0
                || number % 3 == 0;
    }

    public static void main(String[] args) {

        int[] q3array = {6, 3, 6, 5, 12};
        boolean q3Res = family(q3array);
        System.out.println("Res: " + q3Res);

        // Maman 15. Q2.
        int[][] array = new int[][] {
                { -1, 3, -3 },
                {5, -3, -9},
                {-7,- 4, 1},
                {1, 2, 3}
        };
//        System.out.println(Arrays.deepToString(array));

        minAvgRow(array);
    }

    public static int minAvgRow(int[][] arr, int rowIndex, float min, int minIndex) {

        if( rowIndex == 0 )
            return minIndex -1;

        float avg = 0;
        for(int i = 0; i < arr[rowIndex-1].length; i++) {
            avg += arr[rowIndex-1][i];
        }
        avg /= arr[rowIndex-1].length;
        System.out.printf("For row: %d avg: %f\n", rowIndex, avg);
        if( avg < min ) {
            return minAvgRow(arr, rowIndex-1, avg, rowIndex);
        } else
            return minAvgRow(arr, --rowIndex, min, minIndex);
    };

    public static int minAvgRow(int[][] a) {

//        System.out.println(a.length);
//        for(int rowIndex = 0; rowIndex < a.length; rowIndex++)
//            System.out.println(Arrays.toString(a[rowIndex]));

        int res = minAvgRow(a, a.length, Integer.MAX_VALUE, 0);
        System.out.println("Row index with min avg: " + res + " (0-based)");
        return res;
    }

}

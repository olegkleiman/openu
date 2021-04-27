//
// (ממ"ן) 15
//

package com.company;

public class Main {

    public static void main(String[] args) {
        int[][] array = new int[][] {
                { -1, 3, -3 },
                {5, -3, -9},
                {-7,- 4, 1},
                {1, 2, 3}
        };
        minAvgRow(array);
    }

    public static int minAvgRow(int[][] arr, int rowIndex, float min, int minIndex) {

        if( rowIndex == 0 ) {
            return minIndex -1;
        }

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

        int res = minAvgRow(a, a.length, Integer.MAX_VALUE, 0);
        System.out.println("Row index with min avg: " + res + " (0-based)");
        return res;
    }

}

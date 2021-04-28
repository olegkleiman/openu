package com.company;

import java.util.Arrays;

public class Main {

    public static boolean what(int[][] mat, int r, int c) {
        for(int k = r; k < mat.length; k++) {
            for(int j = c; j < mat.length; j++) {
                if(k + 1 < mat.length && mat[k][j] >= mat[k+1][j] )
                    return false;
                if( j + 1 < mat[k].length && mat[k][j] >= mat[k][j+1])
                    return false;
            }
        }
        return true;
    }

    public static boolean twinsNumber(int num) {
        if( num < 100 )
            return false;

        int temp1 = num;
        int temp2 = num / 10;

        if( temp1 == temp2 )
            return false;

        boolean flag = true;
        while( num > 0 ) {
            int temp = num % 10;
//            if( flag == true && != temp1)
//                return false;
//            if( flag == true && != temp2)
//                return false;
            num = num / 10;
            flag = false;
        }

        return true;
    }

    public static void sum(int[] a) {
        sum(a, 0);
    }

    public static int sum(int[] a, int index) {
        if( index == a.length -1 ) // last element?
            return a[index];

        int _sum = sum(a, ++index);
        return a[index-1] += _sum;
    }

//    1, 2, 3
//    6, 5, 3


    public static void main(String[] args) {
        int[][] whatArray = new int[][] {
                {4, 7, 9, 99},
                {19, 34, 56, 78},
                {30, 60, 78, 79},
                {41, 62, 83, 99}
        };
        boolean res = what(whatArray, 0, 0);
        System.out.println("Res: " + res);
        res = what(whatArray, 1, 1);
        System.out.println("Res: " + res);
        res = what(whatArray, 4, 2);
        System.out.println("Res: " + res);

        // 2
//        res = twinsNumber(767);
//        System.out.println("Res: " + res);

        // 3
        int[] a = new int[]{10,2,3};
        System.out.println("Before: " + Arrays.toString(a));
        sum(a);
        System.out.println("After: " + Arrays.toString(a));

        // 4
        int[][] prices = new int[][]{
                {114, 25, 23, 118},
                {78, 121, 120, 127},
                {71, 70, 69, 120},
                {90, 60, 45, 134}
        };
        int [][] club = new int [][]{
                {50, 50, 50, 55},
                {55, 10, 10, 50},
                {25, 10, 12, 30}
        };

        pizzaForClub(100);
    }

    public static int pizzaForClub(int money) {

        int[][] prices = new int[][]{
                {114, 25, 23, 118},
                {78, 121, 120, 127},
                {71, 70, 69, 120},
                {90, 60, 45, 134}
        };
        int [][] club = new int [][]{
                {5, 5, 5, 5},
                {5, 1, 1, 5},
                {5, 6, 5, 3},
                {2, 0, 1, 3},
        };

        int count = 0;
        for(int i = 0; i < prices.length; i++)
            for(int j = 0; j < prices[i].length; j++) {
                int price = prices[i][j];
                // get discount
                int discount = club[i][j];
                price -= discount;
                if( money > price ) {
                    System.out.printf("Type: %d, Tops: %d\n", i,j);
                    count++;
                }

            }

        return count;
    }
}

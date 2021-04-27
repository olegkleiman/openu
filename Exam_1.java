package com.company;

import java.util.Arrays;

// Exam. Q1

public class Main {

    //
    // Returns true if the sum of elements of a in row 'num1'
    // equals to 'num2'
    //
    public static boolean secret(int[][] a, int num1, int num2) {

        for(int i = 0; i < a.length; i++) {
            if( i == a.length - 1
                    && a[i][num1] == num2 )
                return true;
            if( a[i][num1] < num2 )
                num2 = num2 - a[i][num1];
            else
                return false;
        }

        return false;
    }

    public static void main(String[] args) {

        int[][] secretArray = new int[][]{
                {3, 13, 4, 1},
                {7, 2, 1, 3},
                {1, 9, 10, 7},
                {2, 2, 4, 2}
        };

        boolean q1res = secret(secretArray, 0, 13);
        System.out.println("Res: " + q1res);
        q1res = secret(secretArray, 3, 13);
        System.out.println("Res: " + q1res);
        q1res = secret(secretArray, 2, 19);
        System.out.println("Res: " + q1res);

    }

}

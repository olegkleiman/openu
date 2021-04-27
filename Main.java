package com.company;

import java.util.Arrays;

public class Main {

    // Exam. Q4
    public static void mostImportant(int[][] arrived, int[] registered) {
        float max_participation = .0F;
        int max_i = 0, max_j = 0, max_group = 0;

        for (int i = 0; i < arrived.length; i++) {
//            System.out.println(Arrays.toString(arrived[i]));
            for (int group = 0; group < arrived[i].length; group++) {
//                System.out.println(arrived[i][j]);
                    float participation = (float) arrived[i][group] / registered[group];
                    if (participation > max_participation) {
                        max_participation = participation;
                        max_i = i;
                        max_j = group;
                        max_group = group;
                }
            }
        }

        System.out.printf("Most important lesson index: [%d,%d] for group %d\n", max_i, max_j, max_group);
    }

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

    public static boolean balance (int number) {
        int even = 0, odd = 0;
        while( number > 0 ) {
//            System.out.print(number % 10);
            int temp = number % 10;
            number = number / 10;
            if( temp % 2 == 0 )
                odd++;
            else
                even++;
        }
        return odd == even;
    }

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

    public static boolean contains(String str, char ch){
        int index = -1;
        for(int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch)
                index = i;
        }

        return index != -1;
    }

    public static boolean daughter(String s1, String s2) {

        if( s2.length() == 1 ) {
            return contains(s1, s2.charAt(0));
        }

        return daughter(s1, s2.substring(1));
    }

    public static void main(String[] args) {

        boolean q0res = daughter("Java", "Jvd");

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

        boolean isBalanced = balance(3802);
        System.out.println("Is balanced: " + isBalanced);

        int[][] arrived = new int[][]{
                {24, 7, 11, 15, 5},
                {29, 6, 13, 14, 7},
                {20, 4, 12, 15, 4},
                {29, 6, 13, 14, 7},
                {30, 3, 15, 13, 12}
        };
        int[] registered = new int[] {35, 8, 17, 16, 20};
        mostImportant(arrived, registered);

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

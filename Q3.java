package com.company;

import java.util.Arrays;

public class Main {

    public static void sum(int[] a) {
        sum(a, 0);
    }

    public static int sum(int[] a, int index) {
        if( index == a.length -1 ) // last element?
            return a[index];

        int _sum = sum(a, ++index);
        return a[index-1] += _sum;
    }


    public static void main(String[] args) {

        int[] a = new int[]{10,2,3};
        System.out.println("Before: " + Arrays.toString(a));
        sum(a);
        System.out.println("After: " + Arrays.toString(a));
    }
}

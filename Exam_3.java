package com.company;

// Exam. Q3

public class Main {

    
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

    }

    
}

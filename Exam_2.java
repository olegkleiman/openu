package com.company;

import java.util.Arrays;

// Exam. Q2

public class Main {

    public static boolean balance (int number) {
        int even = 0, odd = 0;
        while( number > 0 ) {
            int temp = number % 10;
            number = number / 10;
            if( temp % 2 == 0 )
                odd++;
            else
                even++;
        }
        return odd == even;
    }

    public static void main(String[] args) {

        boolean isBalanced = balance(3802);
        System.out.println("Is balanced: " + isBalanced);
        
    }

}

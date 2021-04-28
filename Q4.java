package com.company;

import java.util.Arrays;

    public static void main(String[] args) {

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


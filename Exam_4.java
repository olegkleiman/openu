package com.company;

import java.util.Arrays;

public class Main {

    // Exam. Q4
    public static void mostImportant(int[][] arrived, int[] registered) {
        float max_participation = .0F;
        int max_i = 0, max_j = 0, max_group = 0;

        for (int i = 0; i < arrived.length; i++) {
            for (int group = 0; group < arrived[i].length; group++) {
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


    public static void main(String[] args) {

        int[][] arrived = new int[][]{
                {24, 7, 11, 15, 5},
                {29, 6, 13, 14, 7},
                {20, 4, 12, 15, 4},
                {29, 6, 13, 14, 7},
                {30, 3, 15, 13, 12}
        };
        int[] registered = new int[] {35, 8, 17, 16, 20};
        mostImportant(arrived, registered);
        
    }

}

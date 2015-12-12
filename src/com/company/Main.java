package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int steps = 0;
        int maxSteps = 0;
        int maxNum = 0;

        for (int i = 13; i < 100000; i++) {
            int num = i;
            steps = 0;

            while (num != 1) {
                if (num % 2 == 0) {
                    num /= 2;
                    steps++;
                    if (steps > maxSteps) {
                        maxSteps = steps;
                        maxNum = i;
                    }
                } else {
                    num = (num * 3) + 1;
                    steps++;
                    if (steps > maxSteps) {
                        maxSteps = steps;
                        maxNum = i;
                    }
                }


            }

        }

        System.out.println(maxNum + " had the longest Collatz Chain of n < 100,000 with " + maxSteps + " steps");

    }
}

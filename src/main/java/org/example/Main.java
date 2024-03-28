package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {21, 19, 20, 34, 9, 9, 19, 21};

        // ---- Arrays-Lab Task 1 ------
        int min = numbers[0];
        int secondMin = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < secondMin && numbers[i] != min) {
                secondMin = numbers[i];
            }
        }

        System.out.println("The smallest number: " + min);
        System.out.println("The second smallest number: " + secondMin);


        // ---- Arrays-Lab Task 2 ----
        int[] uniques = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            int count = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                }
            }
            if (count < 2) {
                uniques[i] = numbers[i];
            }
        }

        for (int a : uniques) {
            System.out.println(a);
        }
    }
}
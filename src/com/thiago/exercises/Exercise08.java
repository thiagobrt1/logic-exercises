package com.thiago.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise08 implements Exercise{
    // Write an algorithm that reads three different integer values and prints them on the screen in decreasing order.

    @Override
    public void execute(Scanner scanner){
        int[] numbers = new int[3];
        System.out.print("Enter the first integer number: ");
        numbers[0] = scanner.nextInt();

        System.out.print("Enter the second integer number: ");
        numbers[1] = scanner.nextInt();

        System.out.print("Enter the third integer number: ");
        numbers[2] = scanner.nextInt();

        Arrays.sort(numbers);

        System.out.print("Numbers sorted in decreasing order: ");

        for(int i = numbers.length - 1; i >= 0; i--){
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
    }
}

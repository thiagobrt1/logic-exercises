package com.thiago.exercises;

import java.util.Scanner;

public class Exercise10 implements Exercise{
    // Write an algorithm that reads three grades obtained by a student and prints the average of those grades.

    @Override
    public void execute(Scanner scanner){
        double[] grades = new double[3];

        System.out.print("Enter grade 1: ");
        grades[0] = scanner.nextDouble();

        System.out.print("Enter grade 2: ");
        grades[1] = scanner.nextDouble();

        System.out.print("Enter grade 3: ");
        grades[2] = scanner.nextDouble();

        double total = 0;

        for(int i = 0; i < grades.length; i++){
           total += grades[i];
        }

        System.out.printf("The average is %.2f%n", total / grades.length);
    }
}

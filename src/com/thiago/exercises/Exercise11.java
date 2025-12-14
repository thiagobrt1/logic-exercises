package com.thiago.exercises;

import java.util.Scanner;

public class Exercise11 implements Exercise{
    /*
    Write an algorithm that reads four grades obtained by a student, calculates their average, and prints
    the student’s name and whether they passed or failed. A student passes with a final average of 7 or higher.
    */

    @Override
    public void execute(Scanner scanner){
        System.out.print("Enter the student's name: ");
        scanner.nextLine();
        String name = scanner.nextLine();

        double[] grades = new double[4];

        System.out.print("Enter grade 1: ");
        grades[0] = scanner.nextDouble();

        System.out.print("Enter grade 2: ");
        grades[1] = scanner.nextDouble();

        System.out.print("Enter grade 3: ");
        grades[2] = scanner.nextDouble();

        System.out.print("Enter grade 4: ");
        grades[3] = scanner.nextDouble();

        double total = 0;

        for(int i = 0; i < grades.length; i++){
            total += grades[i];
        }

        double average = total / 4;

        System.out.println("Student: " + name);
        System.out.printf("Average: %.2f%n", average);

        if(average >= 7){
            System.out.println("Status: Passed");
        }
        else{
            System.out.println("Status: Reproved");
        }
    }
}

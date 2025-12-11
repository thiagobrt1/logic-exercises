package com.thiago.exercises;

import java.util.Scanner;

public class Exercise05 implements Exercise{
    // Write an algorithm that reads the value of the minimum wage and the value of a user's salary,
    // calculates how many minimum wages the user earns, and prints the result on the screen.
    // (Use R$ 1,293.20 as the minimum wage base.)

    private static final double MINIMUM_WAGE = 1293.20;

    @Override
    public void execute(Scanner scanner){
        System.out.print("Enter the salary: ");
        double userSalary = scanner.nextDouble();

        if (userSalary < 0){
            System.out.println("Salary cannot be negative.");
            return;
        }

        double minimumWages = userSalary / MINIMUM_WAGE;
        System.out.printf("The user earns %.2f minimum wages%n", minimumWages);
    }
}

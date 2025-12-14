package com.thiago.exercises;

import java.util.Scanner;

public class Exercise21 implements Exercise{
    /*
    Write an algorithm that calculates a teacher’s net salary.
    The information provided will be: hourly wage, number of classes taught in the month, and the INSS discount percentage.
    Print the final net salary on the screen.
    */

    @Override
    public void execute(Scanner scanner){
        System.out.print("Enter the hourly wage: ");
        double hourlyWage = scanner.nextDouble();

        System.out.print("Enter the number of classes taught in the month: ");
        int classesTaught = scanner.nextInt();

        System.out.print("Enter the INSS discount percentage: ");
        int discountPercentage = scanner.nextInt();

        double salary = hourlyWage * classesTaught;
        double discount = salary * (discountPercentage / 100.00);
        double netSalary = salary - discount;

        System.out.printf("Final net salary: %.2f%n", netSalary);
    }
}

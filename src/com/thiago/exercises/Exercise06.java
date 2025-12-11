package com.thiago.exercises;

import java.util.Scanner;

public class Exercise06 implements Exercise{
    // Write an algorithm that reads any value and print it on the screen with a 5% increase.

    @Override
    public void execute(Scanner scanner){
        System.out.print("Enter a value: ");
        double value = scanner.nextDouble();

        double increasedValue = value * 1.05;
        System.out.println("Value with a 5% increase: " + increasedValue);
    }
}

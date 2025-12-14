package com.thiago.exercises;

import java.util.Scanner;

public class Exercise17 implements Exercise{
    /*
    Write an algorithm that reads a temperature in Fahrenheit, calculates the corresponding temperature in Celsius,
    and prints both temperatures on the screen.

    Formula:
    C = (5 * (F − 32)) / 9
    */

    @Override
    public void execute(Scanner scanner){
        System.out.print("Enter a temperature in Fahrenheit: ");
        double f = scanner.nextDouble();

        double c = (5 * (f - 32)) / 9;

        System.out.printf("Temperature in Fahrenheit: %.1f F %n", f);
        System.out.printf("Temperature in Celsius: %.1f C %n", c);
    }
}

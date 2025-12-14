package com.thiago.exercises;

import java.util.Scanner;

public class Exercise22 implements Exercise{
    /*
    Write an algorithm that calculates the amount of fuel (in liters) used on a trip,
    knowing that the car runs 12 km per liter.

    The user must provide the travel time and the average speed.
    Calculate and print the distance traveled and the amount of fuel used.

    Formula:
    Distance = time × speed
    Fuel used = distance / 12
    */

    private static final int KM_PER_LITER = 12;

    @Override
    public void execute(Scanner scanner){
        System.out.print("Enter the travel time in hours: ");
        double hoursTraveled = scanner.nextInt();

        System.out.print("Enter the average speed (km/h): ");
        double averageSpeed = scanner.nextInt();

        double distance = hoursTraveled * averageSpeed;
        double fuelUsed = distance / KM_PER_LITER;

        System.out.println("Distance traveled: " + distance + " km");
        System.out.printf("Amount of fuel used: %.2f liters%n", fuelUsed);
    }
}

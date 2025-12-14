package com.thiago.exercises;

import java.util.Scanner;

public class Exercise15 implements Exercise{
    /*
    Write an algorithm that reads the year a person was born and prints how many years, months, and days the person has lived.
    Consider that 1 year has 365 days.
    */

    private static final int CURRENT_YEAR = 2025;
    private static final int MONTHS_IN_YEAR = 12;
    private static final int DAYS_IN_YEAR = 365;

    @Override
    public void execute(Scanner scanner){
        System.out.print("Enter the year you were born: ");
        int birthYear = scanner.nextInt();

        if(birthYear <= 0 || birthYear > CURRENT_YEAR){
            System.out.println("Birth year is invalid!");
            return;
        }

        int yearsLived = CURRENT_YEAR - birthYear;
        int monthsLived = yearsLived * MONTHS_IN_YEAR;
        int daysLived = yearsLived * DAYS_IN_YEAR;

        System.out.println(yearsLived + " years lived.");
        System.out.println(monthsLived + " months lived.");
        System.out.println(daysLived + " days lived.");
    }
}

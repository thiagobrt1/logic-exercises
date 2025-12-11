package com.thiago.exercises;

import java.util.Scanner;

public class Exercise09 implements Exercise{
    /*
    Write an algorithm that calculates a person's BMI, reads their weight and height, and prints their condition according
    to the table below:

    BMI formula: weight / (height)²

    BMI Categories:
    Below 18.5   | Underweight
    18.6 to 24.9 | Ideal weight
    25.0 to 29.9 | Slightly overweight
    30.0 to 34.9 | Obesity grade I
    35.0 to 39.9 | Obesity grade II (severe)
    40 or above  | Obesity grade III (morbid)
    */

    @Override
    public void execute(Scanner scanner){
        System.out.print("Enter the height (meters): ");
        double height = scanner.nextDouble();

        System.out.print("Enter the weight (kg): ");
        double weight = scanner.nextDouble();

        double bmi = weight / (height * height);

        System.out.printf("BMI: %.2f%n", bmi);

        if(bmi < 18.5){
            System.out.println("Person is underweight");
        }
        else if(bmi < 25){
            System.out.println("Person is in ideal weight");
        }
        else if(bmi < 30){
            System.out.println("Person is slightly overweight");
        }
        else if(bmi < 35){
            System.out.println("Person is in obesity grade I");
        }
        else if(bmi < 40){
            System.out.println("Person is in obesity grade II (severe)");
        }
        else{
            System.out.println("Person is in obesity grade III (morbid)");
        }
    }
}

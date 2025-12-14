package com.thiago.exercises;

import java.util.Scanner;

public class Exercise18 implements Exercise{
    /*
    Frank is 1.60 meters tall and grows 3 centimeters per year, while Sarah is 1.65 meters tall and grows 1 centimeter per year.
    Write an algorithm that calculates and prints how many years it will take for Frank to become taller than Sarah.
    */

    @Override
    public void execute(Scanner scanner){
        double frankHeight = 1.60;
        double sarahHeight = 1.65;
        int years = 0;

        System.out.printf("Frank original height: %.2f%n", frankHeight);
        System.out.printf("Sarah original height: %.2f%n", sarahHeight);

        while(sarahHeight > frankHeight){
            frankHeight += 0.03;
            sarahHeight += 0.01;
            years++;
        }

        System.out.printf("Frank final height: %.2f%n", frankHeight);
        System.out.printf("Sarah final height: %.2f%n", sarahHeight);
        System.out.println("It will take " + years + " years for Frank to become taller than Sarah.");
    }
}

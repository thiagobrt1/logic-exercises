package com.thiago.exercises;

import java.util.Scanner;

public class Exercise13 implements Exercise{
    /*
    Write an algorithm that reads a person’s name and age, and prints the person’s name and whether
    they are of legal age or underage.
    */

    @Override
    public void execute(Scanner scanner){
        scanner.nextLine();

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if(age <= 0){
            System.out.println("Invalid age.");
            return;
        }

        if(age >= 18){
            System.out.println(name + " is of legal age.");
        }
        else{
            System.out.println(name + " is underage.");
        }
    }
}

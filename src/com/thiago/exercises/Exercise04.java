package com.thiago.exercises;

import java.util.Scanner;

public class Exercise04 implements Exercise{
    // Write an algorithm that receives an integer number and prints its predecessor and its successor on the screen.

    @Override
    public void execute(Scanner scanner){
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Predecessor: " + (number - 1));
        System.out.println("Successor: " + (number + 1));
    }
}

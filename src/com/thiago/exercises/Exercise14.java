package com.thiago.exercises;

import java.util.Scanner;

public class Exercise14 implements Exercise{
    /*
    Write an algorithm that reads two values, A and B, swaps the value of A with B and the value of B with A,
    and prints the final values.
    */

    @Override
    public void execute(Scanner scanner){
        System.out.print("Enter the value of A: ");
        int a = scanner.nextInt();

        System.out.print("Enter the value of B: ");
        int b = scanner.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("New value of A: " + a);
        System.out.println("New value of B: " + b);
    }
}

package com.thiago.exercises;

import java.util.Scanner;

public class Exercise01 implements Exercise{
    // Create an algorithm that reads the values of A, B, and C,
    // then prints the sum of A and B and shows whether the sum is less than C.

    @Override
    public void execute(Scanner scanner){
        System.out.print("Enter the value of A: ");
        int a = scanner.nextInt();

        System.out.print("Enter the value of B: ");
        int b = scanner.nextInt();

        System.out.print("Enter the value of C: ");
        int c = scanner.nextInt();

        int sum = a + b;
        System.out.println("The sum of A and B is " + sum);

        if(sum < c){
            System.out.println("The sum is less than C");
        }
        else{
            System.out.println("The sum is not less than C");
        }
    }
}

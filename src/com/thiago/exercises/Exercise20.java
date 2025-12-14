package com.thiago.exercises;

import java.util.Scanner;

public class Exercise20 implements Exercise{
    // Write an algorithm that receives an integer value and prints its multiplication table on the screen.

    @Override
    public void execute(Scanner scanner){
        System.out.print("Enter an integer number: ");
        int n = scanner.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }
}

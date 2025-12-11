package com.thiago.exercises;

import java.util.Scanner;

public class Exercise02 implements Exercise{
    // Write an algorithm that receives any number and prints on the screen whether the number is even or odd,
    // and whether it is positive or negative.

    @Override
    public void execute(Scanner scanner){
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if(number == 0){
            System.out.println(number + " is an even number, but it is neither positive nor negative");
            return;
        }

        if(number % 2 == 0){
            if(number > 0){
                System.out.println(number + " is an even and a positive number");
            }
            else{
                System.out.println(number + " is an even and a negative number");
            }
        }
        else{
            if(number > 0){
                System.out.println(number + " is an odd and a positive number");
            }
            else{
                System.out.println(number + " is an odd and a negative number");
            }
        }
    }
}

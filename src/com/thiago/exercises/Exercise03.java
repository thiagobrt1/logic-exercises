package com.thiago.exercises;

import java.util.Scanner;

public class Exercise03 implements Exercise{
    /*
    Write an algorithm that reads two integer values A and B. If the values of A and B are equal,
    you must add the two values; otherwise, you must multiply A by B. After either calculation,
    assign the result to a variable C and print its value on the screen.
    */

    @Override
    public void execute(Scanner scanner){

        System.out.print("Enter the value of A: ");
        int a = scanner.nextInt();

        System.out.print("Enter the value of B: ");
        int b = scanner.nextInt();

        int c;

        if(a == b){
            c = a + b;
        }
        else{
            c = a * b;
        }

        System.out.println("The result is " + c);
    }
}

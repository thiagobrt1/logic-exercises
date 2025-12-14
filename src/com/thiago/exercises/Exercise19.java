package com.thiago.exercises;

import java.util.Scanner;

public class Exercise19 implements Exercise{
    // Write an algorithm that prints the multiplication tables from 1 to 10 on the screen.

    @Override
    public void execute(Scanner scanner){
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= 10; j++){
                System.out.println(i + " x " + j + " = " + i * j);
            }

            System.out.println();
        }
    }
}

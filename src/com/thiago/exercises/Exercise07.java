package com.thiago.exercises;

import java.util.Scanner;

public class Exercise07 implements Exercise{
    // Write an algorithm that reads two boolean values and determines whether both are TRUE or both are FALSE.

    @Override
    public void execute(Scanner scanner){
        System.out.print("Enter the first boolean value (TRUE or FALSE): ");
        boolean booleanValue1 = scanner.nextBoolean();

        System.out.print("Enter the second boolean value (TRUE or FALSE): ");
        boolean booleanValue2 = scanner.nextBoolean();

        if(booleanValue1 && booleanValue2){
            System.out.println("Both boolean values are TRUE");
        }
        else if(!booleanValue1 && !booleanValue2){
            System.out.println("Both boolean values are FALSE");
        }
        else{
            System.out.println("The boolean values are different");
        }
    }
}

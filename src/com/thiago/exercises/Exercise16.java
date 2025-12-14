package com.thiago.exercises;

import java.util.Scanner;

public class Exercise16 implements Exercise{
    /*
    Write an algorithm that reads three values representing the three sides of a triangle,
    checks if they are valid, and determines whether the triangle is equilateral, isosceles, or scalene.
    */

    @Override
    public void execute(Scanner scanner){
        System.out.print("Enter side A of triangle: ");
        int a = scanner.nextInt();

        System.out.print("Enter side B of triangle: ");
        int b = scanner.nextInt();

        System.out.print("Enter side C of triangle: ");
        int c = scanner.nextInt();

        if(a <= 0 || b <= 0 || c <= 0){
            System.out.println("Invalid values (must be greater than 0).");
            return;
        }

        if(a + b > c && a + c > b && b + c > a){
            if(a == b && b == c){
                System.out.println("Equilateral triangle");
            }
            else if(a == b || a == c || b == c){
                System.out.println("Isosceles triangle");
            }
            else{
                System.out.println("Scalene triangle");
            }
        }
        else{
            System.out.println("Values do not form a valid triangle.");
        }
    }
}

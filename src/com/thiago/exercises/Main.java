package com.thiago.exercises;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Exercise[] exercises = {
                new Exercise01(),
                new Exercise02(),
                new Exercise03(),
                new Exercise04(),
                new Exercise05(),
                new Exercise06(),
                new Exercise07(),
                new Exercise08(),
                new Exercise09(),
                new Exercise10(),
                new Exercise11()
        };

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("Choose an exercise (1-22) or 0 to exit: ");
            int choice = scanner.nextInt();

            if(choice == 0){
                break;
            }

            if(choice < 1 || choice > exercises.length){
                System.out.println("Invalid option!");
                continue;
            }

            exercises[choice - 1].execute(scanner);
        }

        scanner.close();
    }
}

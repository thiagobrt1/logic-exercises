package com.thiago.exercises;

import java.util.Scanner;

public class Exercise12 implements Exercise{
    /*
    Write an algorithm that reads the price of a product and determines the final amount
    to be paid based on the payment method chosen by the customer. Print the final price on the screen.
    Use the payment condition codes below to perform the calculation.

    Payment Conditions Table
    Cash or Pix payment: 15% discount
    Credit card (one payment): 10% discount
    Credit card (two installments): regular price, no interest
    Credit card (three or more installments): regular price plus 10% interest
    */

    @Override
    public void execute(Scanner scanner){
        scanner.nextLine();

        System.out.print("Enter the product name: ");
        String productName = scanner.nextLine();

        System.out.print("Enter the product price: ");
        double productPrice = scanner.nextDouble();

        System.out.println("1. Cash");
        System.out.println("2. Pix");
        System.out.println("3. Credit Card (One Payment)");
        System.out.println("4. Credit Card (Two Installments)");
        System.out.println("5. Credit Card (Three or More Installments)");
        System.out.print("Enter the payment method: ");
        int paymentMethod = scanner.nextInt();

        double finalPrice = productPrice;

        if(paymentMethod == 1 || paymentMethod == 2){
            finalPrice -= productPrice * 0.15;
        }
        else if(paymentMethod == 3){
            finalPrice -= productPrice * 0.1;
        }
        else if(paymentMethod == 4){
            finalPrice = productPrice;
        }
        else if(paymentMethod == 5){
            finalPrice += productPrice * 0.1;
        }
        else{
            System.out.println("Invalid payment method.");
            return;
        }

        System.out.printf("Final price for %s: %.2f", productName, finalPrice);
        System.out.println();
    }
}

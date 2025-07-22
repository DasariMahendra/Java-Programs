package com.basic;

import java.util.Scanner;

public class RollerCastCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your height in cm: ");
        int height = sc.nextInt();

        System.out.print("Do you have an adult with you? (true/false): ");
        boolean hasAdult = sc.nextBoolean();

        // Check conditions
        if (age < 12) {
            System.out.println("Sorry, you're too young");
        } else if (height <= 150) {
            System.out.println("Sorry, you're not tall enough");
        } else if (age < 15 && !hasAdult) {
            System.out.println("Sorry, you need an adult with you");
        } else if (age < 15 && hasAdult) {
            System.out.println("You can ride with adult supervision!");
        } else {
            System.out.println("You can ride by yourself!");
        }
        sc.close();
    }
}


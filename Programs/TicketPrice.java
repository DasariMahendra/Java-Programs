package com.basic;

public class TicketPrice {
    public static void main(String[] args) {
        // Sample inputs (you can change these values to test different cases)
        int age = 45;
        int time = 1600;
        boolean isHoliday = true;

        String ticketType = "";
        int price = 0;

        // Determine ticket type and price
        if (age < 13) {
            ticketType = "CHILD";
            price = 8;
            if (isHoliday) {
                price += 2;
            }
        } else if (age <= 17) {
            ticketType = "TEEN";
            price = 12;
            if (isHoliday) {
                price += 3;
            }
        } else if (age <= 59) {
            ticketType = "ADULT";
            price = 15;
            if (isHoliday) {
                price += 5;
            }
            if (time < 1700) {
                price -= 3;
            }
        } else {
            ticketType = "SENIOR";
            price = 10;
            if (time < 1700) {
                price -= 2;
            }
        }

        // Output the result
        System.out.println("Ticket Type: " + ticketType);
        System.out.println("Price: $" + price);
    }
}
package com.basic;

import java.util.Scanner;

public class Ability {
	
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter a class range from 1 to 10:");
    	int classNumber = sc.nextInt();


        String specialAbility;
        int health;
        int power;

        switch (classNumber) {
            case 1: // Warrior
                specialAbility = "Sword Master";
                health = 100;
                power = 8;
                break;
            case 2: // Mage
                specialAbility = "Spell Caster";
                health = 70;
                power = 10;
                break;
            case 3: // Archer
                specialAbility = "Sharp Shooter";
                health = 80;
                power = 9;
                break;
            case 4: // Healer
                specialAbility = "Life Giver";
                health = 60;
                power = 7;
                break;
            case 5: // Knight
                specialAbility = "Shield Bearer";
                health = 90;
                power = 8;
                break;
            default: // Invalid class number
                specialAbility = "Unknown";
                health = 50;
                power = 5;
        }

        // Output the character's stats
        System.out.println("Class Number: " + classNumber);
        System.out.println("Special Ability: " + specialAbility);
        System.out.println("Health: " + health);
        System.out.println("Power: " + power);
        sc.close();
    }
}


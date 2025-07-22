package com.programs;

import java.util.*;

public class NumbeGuesser {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		int secretNumber = random.nextInt(100)+1;
		int guess =0;
		int attempts =0;
		
		System.out.println("--Number Guessing Game--");
		System.out.println("Can you guess the number:");
		
		do {
			System.out.println("Enter your guess:");
			guess = sc.nextInt();
			attempts++;
			
			if(guess < secretNumber) {
				System.out.println("low the Secret Numnber");
			}
			else if(guess > secretNumber) {
				System.out.println("High the Secret Numnber");
			}
			else {
				System.out.println("Congrulations! You guessed the number in "+attempts +" attempts");
			}
						
		}
		while(guess != secretNumber);
		sc.close();
	}

}

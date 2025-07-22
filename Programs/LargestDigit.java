package com.programs;

import java.util.Scanner;

public class LargestDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num =sc.nextInt();
		int maxdigit = 0;
		while(num>0) {
			int digit=num%10;
			if(digit > maxdigit) {
				maxdigit=digit;
			}
			num/=10;
		}
		System.out.println("largest Digit: " + maxdigit);
		sc.close();
	}

}

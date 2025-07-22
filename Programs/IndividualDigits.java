package com.programs;

import java.util.Scanner;

public class IndividualDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int digit = 0;
		while(num>0) {
			digit=num%10;
			System.out.println("digits :" + digit);
			num=num/10;
		}
		sc.close();
	}

}

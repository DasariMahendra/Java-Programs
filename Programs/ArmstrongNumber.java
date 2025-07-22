package com.programs;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int sum=0;
		int originalNum=num;
		
		int nofdigits=String.valueOf(num).length();	
		
		while(num>0) {
			int digit=num%10;
			sum+=Math.pow(digit, nofdigits);
			num/=10;
		}
		if(sum==originalNum) {
			System.out.println("Palindrome Number");
		}
		else {
			System.out.println("Not a Palindrome Number");
		}
		sc.close();
	}
}

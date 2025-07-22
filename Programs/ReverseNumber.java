package com.programs;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int digit;
		int rev=0;
		
		while(num!=0) {
			digit=num%10;
			rev= rev*10+digit;
			num/=10;
		
		}
		System.out.println(rev);
		sc.close();
	}
}

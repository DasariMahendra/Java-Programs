package com.programs;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		int firstNum= sc.nextInt();
		System.out.println("Enter second number:");
		int secondNum= sc.nextInt();
		
		System.out.println("Enter a range:");
		int range= sc.nextInt();
		
		for(int i=secondNum;i<=range;i++) {
			System.out.print(firstNum + " ");
			
			int nextNum= firstNum + secondNum;
			firstNum= secondNum;
			secondNum= nextNum;
		}
		sc.close();
	}

}

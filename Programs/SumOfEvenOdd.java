package com.programs;

import java.util.Scanner;

public class SumOfEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		
		int evensum=0;
		int oddsum=0;
		
		for(int i=1;i<=num;i++) {
			if(i%2==0) {
				evensum+=i;
			}
			else {
				oddsum+=i;
			}
		}
		System.out.println("Sum of Even Numbers: " +evensum);
		System.out.println("Sum of Odd Numbers: " +oddsum);
		sc.close();
	}

}

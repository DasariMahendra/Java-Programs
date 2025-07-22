package com.programs;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number upto where u want to primes: ");
		int n =sc.nextInt();
		int primeCount=0;
		
		System.out.println("Prime numbers between 1 and " + n +" are ");
		for(int i=2; i<=n; i++) {
			int count = 0;
			for (int j=2; j<i; j++) {
				if(i%j==0) {
					count++;
					break;
				}
			}
			if(count==0) {
			System.out.print(i + " ");
			primeCount++;
			}
		}
		System.out.println();
		System.out.println("Total number of primes between 1 and " + n +" are " +primeCount);
		sc.close();
	}
}


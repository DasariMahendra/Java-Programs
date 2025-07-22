package com.programs;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int n =sc.nextInt();
		sc.close();
		
		if(n<0){
			System.out.println("It's a fact that we can't find the factorial of a negative number.");
		}
		else if(n==0 || n==1) {
			System.out.println("factorial of " +n +" is 1");
		}
		else {
		    int num=1;
			for(int i=1; i<=n; i++) {
				num*=i;
			}
			System.out.println("factorial of " +n +" is " +num);
		}
		
	}

}

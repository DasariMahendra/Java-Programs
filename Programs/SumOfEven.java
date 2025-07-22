package com.programs;

import java.util.Scanner;

public class SumOfEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a number where you need sum of even numbers:");
	     int N = sc.nextInt();
	     int k = N / 2;
	     int sum = k * (k + 1);  
	     System.out.println(sum);
	     sc.close();
	}
}

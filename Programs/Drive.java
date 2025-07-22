package com.programs;

import java.util.Scanner;

public class Drive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age:");
		int age =sc.nextInt();
		
		if (age>=18) {
			System.out.println("Do you have License(true/false)");
			boolean hasLicense=sc.nextBoolean();
			if(hasLicense) {
				System.out.println("You can Drive");
			}
			else {
				System.out.println("Apply for License");
			}
		}
		else {
			System.out.println("You are Minor, You cant Drive");
		}
		sc.close();
	}

}

package com.programs;

import java.util.Scanner;

public class IndividualCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a String:");
		String input=sc.next();
		sc.close();
		
		int len = input.length();
		System.out.println(len);
		
		int i;
		for(i=0; i<len; i++) {
			System.out.println(input.charAt(i));
		}
	}
}

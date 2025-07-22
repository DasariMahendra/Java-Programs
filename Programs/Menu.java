package com.programs;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Here is the Order Menu");
		System.out.println("1.Chicken 65");
		System.out.println("2.Panner");
		System.out.println("3.Icecream");
		System.out.println("4.Briyani");
		System.out.println("5.Tea");
		System.out.println("Select the order number for you order:");
		int order =sc.nextInt();
		
		switch(order) {
		case 1 : 
			System.out.println("Your Chicken 65 order placed successfully");
		    break;
		case 2:
			System.out.println("Your Panner order placed successfully");
			break;
		case 3:
			System.out.println("Your Icecream order placed successfully");
			break;
		case 4:
			System.out.println("Your Briyani order placed successfully");
			break;
		case 5:
			System.out.println("Your Tea order placed successfully");
			break;
		default:
			System.out.println("please select the order numbers from 1 to 5 ");
		}
		sc.close();
	}

}

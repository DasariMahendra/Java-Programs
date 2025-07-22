package com.programs;

import java.util.Scanner;

public class BasicCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter arithmetic opeartors like + ,- ,* ,/ ,%");
		String operators=sc.nextLine();
		char operator=operators.charAt(0);
		
		System.out.println("Enter a number:");
		int num1 =sc.nextInt();
		System.out.println("Enter another umber:");
		int num2 =sc.nextInt();
		
		int result;
		
		switch(operator) {
		case '+':
			result= num1 + num2;
			System.out.println("Addition of" +" " +num1 + "+" +num2 + "->" +result);
			break;
		case '-':
			result= num1 - num2;
			System.out.println("Subtraction of" +" " +num1 + "-" +num2 + "->" +result);
			break;	
		case '*':
			result= num1 * num2;
			System.out.println("Multiplication of" +" " +num1 + "x" +num2 + "->" +result);
			break;	
		case '/':
			result= num1 / num2;
			System.out.println("Division of" +" " +num1 + "/" +num2 + "->" +result);
			break;
		case '%':
			result= num1 % num2;
			System.out.println("Modulo of" +" " +num1 + "%" +num2 + "->" +result);
			break;
		default:
			System.out.println("Enter operations only + ,- ,* ,/ ,%" );
			
		}
		sc.close();
		
	}

}

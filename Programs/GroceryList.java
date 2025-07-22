package com;

import java.util.Scanner;

public class GroceryList {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		for(int i=1; i<=5 ;i++){
			System.out.println("Enter item #" +i +":");
			String input = scanner.nextLine();
			if(input.equalsIgnoreCase("skip")) {
				continue;
			}else if(input.equalsIgnoreCase("done")) {
				break;
			}
			System.out.println("You added: "+input);
			
		}
		scanner.close();
	}
}

package com.programs;

import java.util.Scanner;

public class CountOfCharacters {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no of Charcters: ");
		int num = sc.nextInt();
		sc.nextLine();
        char[] chars = new char[num];

        for (int i = 0; i < num; i++) {
            System.out.print("Enter character " + (i + 1) + ": ");
            chars[i] = sc.nextLine().charAt(0);  
        }

        System.out.println("You entered:");
        for (char c : chars) {
            System.out.println(c);
        }
	sc.close();
	}

}

package com.programs;

import java.util.Scanner;

public class SumOfMultiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		
		int multipleofthree=0;
		int multipleoffive=0;
		
		for(int i=1;i<=num; i++) {
			if(i%3==0) {
				multipleofthree+=i;
			}
		}
		for(int i=1;i<=num; i++) {
			if(i%5==0) {
				multipleoffive+=i;
			}
		}
		System.out.println("Total: " + (multipleofthree+multipleoffive));
		sc.close();
	}

}

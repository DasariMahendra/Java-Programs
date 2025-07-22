package com.programs;

import java.util.Scanner;

public class Sum0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers:");
		int num;
		num=sc.nextInt();
		int sum=0;
		 while(num!=0) {
			 sum+=num;
			 num=sc.nextInt();
		 }
		 System.out.println("sum: "+ sum);
		 sc.close();
	}

}

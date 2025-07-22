package com.programs;

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Marks");
		int marks=sc.nextInt();
		
		if(marks>=50 && marks<=100) {
			System.out.println("You are Passed");
			
			if((marks>=90 && marks<=100)){
				System.out.println("Grade-A");
			}
			else if((marks>=70 && marks<90)) {
				System.out.println("Grade-B");
			}
			else if((marks>=50 && marks<70)) {
				System.out.println("Grade-C");
			}
		}
		else if(marks>=0 && marks<50) {
			System.out.println("Failed!!!");
		
		}
		else{
			System.out.println("marks should be b/w 0-100");
		}
		sc.close();
	}

}

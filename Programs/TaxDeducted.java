package com.programs;

import java.util.Scanner;

public class TaxDeducted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter your Salary:");
		int salary= sc.nextInt();
		int tax;
		
		if (salary>0 && salary <250000) {
			System.out.println("No tax to be paid");
		}
		else if (salary >=250000 && salary <500000) {
			tax= salary * 5/100;
			System.out.println("Tax to be paid is " +tax);
		}
		else if (salary >=500000 && salary <1000000) {
			tax= salary * 20/100;
			System.out.println("Tax to be paid is " +tax);
		}
		else if (salary > 1000000){
			tax=salary * 30/100;
			System.out.println("Tax to be paid is " +tax);
		}
		else {
			System.out.println("Enter salary in positive");
		}
		sc.close();
	}

}

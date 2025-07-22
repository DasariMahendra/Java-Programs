package com;

import java.util.Scanner;

public class EmployeeSalaryCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter hourly age:");
		double hourlyWage = sc.nextDouble();
		
		System.out.println("Enter hours worked per week:");
		double hoursWorked = sc.nextDouble();
		sc.close();
		double weeklySalary;
		if(hoursWorked >40) {
			weeklySalary = calculateWeeklySalary(hourlyWage, hoursWorked, 1.5);
		}else {
			weeklySalary = calculateWeeklySalary(hourlyWage, hoursWorked);
		}
		
		double annualSalary = calculateAnnualSalary(weeklySalary);
		
		System.out.printf("Weekly Salary: %.2f\n", weeklySalary);
		System.out.printf("Annual Salary: %.2f\n", annualSalary);
	}
	
	public static double calculateWeeklySalary(double hourlyWage, double hoursWorked) {
		return hourlyWage * hoursWorked;
	}
	
	
	public static double calculateWeeklySalary(double hourlyWage, double hoursWorked, double overtimeRate) {
		
		double regularHours = Math.min(hoursWorked, 40);
		double overtimeHours =Math.max(hoursWorked -40 , 0);
		return (regularHours * hourlyWage) + (overtimeHours * hourlyWage *overtimeRate);
	
	}
	
	
	public static double calculateAnnualSalary(double weeklySalary) {
		return weeklySalary *52;
	}
	
}

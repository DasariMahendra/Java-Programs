package com.programs;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Marks:");
		int n= sc.nextInt();
		
		 String grade= (n>=90 && n<=100) ? "Grade-A" :
			 		   (n>=70 && n<90) ? "Grade-B" :
				       (n>=50 && n<70) ? "Grade-C" : 
					   (n>=0 && n<50) ? "Fail" : "marks should be b/w 0-100";
		 System.out.println(grade);
		 sc.close();
	}

}

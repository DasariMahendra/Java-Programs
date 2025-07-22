package com.basic;

import java.util.Scanner;

public class OpeartionResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in); // Don't change this line
        int n1 = sc.nextInt(); // Don't change this line
        int n2 = sc.nextInt(); // Don't change this line
        sc.nextLine(); // Don't change this line
        String op = sc.nextLine(); // Don't change this line
        
        // Write your code below
        double result = 0;
        if (op.equals("+")){
            result = n1+n2;
        }
        else if (op.equals("-")){
            result = n1-n2;
        }
        else if(op.equals("/")){
            result = n1/n2;
        }
        else if(op.equals("*")){
            result = n1*n2;
        }
        System.out.println(result);
        sc.close();
    }


}

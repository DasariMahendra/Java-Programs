package com.programs;

public class FactorialUsingWhile {

	public static void main(String[] args) {
		int n = 6;
        int i = 1;
        while (n > 0) {
            i = i * n;
            n--;
        }
        System.out.println("Factorial of given number is "
                           + i);
    }
	
}

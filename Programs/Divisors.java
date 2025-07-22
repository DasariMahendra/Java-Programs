package com.programs;

public class Divisors {

	public static void main(String[] args) {
		int num = 12;
        int i = 1;
        System.out.print("The divisors of " + num + " are: ");
        while (i <= num) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
	}
}

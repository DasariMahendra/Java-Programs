package com.programs;

import java.util.Scanner;

public class NextPrimeNumber {
	public static boolean isPrime(int num) {
        if (num <= 1) return false;
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int next = n + 1;
        while (true) {
            if (isPrime(next)) {
                System.out.println(next);
                break;
            }
            next++;
        }
		sc.close();
	}
}

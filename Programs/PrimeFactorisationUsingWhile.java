package com.programs;

public class PrimeFactorisationUsingWhile {

	public static void printPrimeFactorization(int n) {
        // Print the number of 2s that divide n
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }

        // n must be odd at this point, so we can skip even numbers
        for (int i = 3; i * i <= n; i += 2) {
            // While i divides n, print i and divide n
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }

        // If n is a prime number greater than 2
        if (n > 2) {
            System.out.print(n + " ");
        }
    }

    // Optional main method for testing
    public static void main(String[] args) {
        printPrimeFactorization(100);  // Output: 2 2 3 5
    }
}

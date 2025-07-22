package com.programs;

public class PrimeFactorisation {

	public static void main(String[] args) {
	 int n = 100;

        printFactors(n);
    }

    
    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true; 
    }

   
    public static void printFactors(int n) {
        for (int i = 2; i <= n; i++) {
           
            if (isPrime(i)) {
               
                while (n % i == 0) {
                    System.out.print(i + " ");
                    n = n / i;
                }
            }
        }
	}
}

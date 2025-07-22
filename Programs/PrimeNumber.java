package com.programs;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n =sc.nextInt();
		
		PrimeNumber pn=new PrimeNumber();
		pn.prime1(n);
		pn.prime2(n);
		pn.prime3(n);
		pn.prime4(n);
		sc.close();
	}
	
	    // number with 2 factors like 1 and itself
		void prime1(int n){
			int count=0;
					
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("case prime1: " +n +" " +"prime");
			}
	    else {
			System.out.println("case prime1: " +n +" " +"not a prime");
			}
	}
		
	    // number with 1 factors like itself without including 1
		void prime2(int n){
			int count=0;
						
		for(int i=2;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==1) {
			System.out.println("case prime2: " +n +" " +"prime");
			}
		   else {
			System.out.println("case prime2: " +n +" " +"not a prime");
		}
	}
		
		// number with 0 factors without including 1 and itself
		void prime3(int n){
			int count=0;
						
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==0) {
			System.out.println("case prime3: " +n +" " +"prime");
			}
		   else {
			System.out.println("case prime3: " +n +" " +"not a prime");
		}
	
	}
		void prime4(int n){
			int count=0;
						
		for(int i=2;i<n;i++) {
			if(n%2==0) {
				count++;
			}
		}
		if(count==0) {
			System.out.println("case prime3: " +n +" " +"prime");
			}
		   else {
			System.out.println("case prime3: " +n +" " +"not a prime");
		}
	}
}

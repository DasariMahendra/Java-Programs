package com.programs;

import java.util.Scanner;

public class BillDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No of Products:");
		int products=sc.nextInt();
		
		
		int costOfProducts=1000;
		int discountForEachProductPremiumUser=100;
		int discountForEachProductNonPremiumUser=0;
		
		if(products>0) {
			System.out.println("Do you have premium (true/false):");
			boolean premiumUser=sc.nextBoolean();
			
			if(premiumUser==true) {
				int finalBillPremiumUser=((products*costOfProducts)-(products*discountForEachProductPremiumUser));
				System.out.println(finalBillPremiumUser);
			}
			else {
				int finalBillNonPremiumUser=((products*costOfProducts)-(products*discountForEachProductNonPremiumUser));
				System.out.println(finalBillNonPremiumUser);
			}
		}
		else {
			System.out.println("Buy products ");
		}
		
		sc.close();
	}

}

package com.basic;

import java.util.Scanner;

public class Wind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a wind range:");
        int wind = sc.nextInt(); 
        String status = "unset";
 
        if(wind < 8 ){
            status = "Calm";
        }
        else if(wind >=8 && wind <=31){
            status="Breeze";
        }
        else if(wind >= 32 && wind <=63){
            status="Gale";
        }
        else{
            status="Storm";
        }
        System.out.println("status = " + status);
        sc.close(); 
	}

}

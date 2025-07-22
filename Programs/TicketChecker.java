package com;

import java.util.*;

public class TicketChecker {
	
	public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter your age:");
	    int age = sc.nextInt();
	    
	    System.out.println("Choose a day (1-7): ");
	    int day = sc.nextInt();
	    
	    if(age<13){
	        System.out.println("Child discount applies.");
	    }
	    else if(age>=13 && age<=17){
	        System.out.println("Teen discount applies.");
	    }
	    else if(age>=18 && age<=64){
	        System.out.println("Standard price.");
	    }
	    else{
	        System.out.println("Senior discount applies.");
	    }
	    
	    switch(day){
	        case 1:
	            System.out.println("You selected: Monday");
	            break;
	        case 2:
	            System.out.println("You selected: Tuesday");
	            break;
	        case 3:
	            System.out.println("You selected: Wednesday");
	            break;
	        case 4:
	            System.out.println("You selected: Thursday");
	            break;
	        case 5:
	            System.out.println("You selected: Friday");
	            break;
	        case 6:
	            System.out.println("You selected: Saturday");
	            break;
	        case 7:
	            System.out.println("You selected: Sunday");
	            break;
	        default:
	            System.out.println("Invalid day number.");
	            
	    }
	    sc.close();
	}
}

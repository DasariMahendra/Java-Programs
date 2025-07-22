package com.basic;

import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Month Number:");
        int month = sc.nextInt();
        String season = "";
        
        // Write your code below
        switch (month){
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;
            default:
                season = "Invalid month";
        }
        System.out.println(season);
        sc.close();
    }
}

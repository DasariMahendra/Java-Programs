package com.basic;

import java.util.Scanner;

public class ScoreGrade {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter your Score marks:");
        int score = sc.nextInt();  // You can change this score to test different cases

        // Determine the letter grade using nested ternary operators
        String grade = (score >= 90) ? "A" :
                             (score >= 80) ? "B" :
                             (score >= 70) ? "C" :
                             (score >= 55) ? "D" : 
                             (score >= 40) ? "E" : "F";

        // Determine the status message using ternary operators
        String statusMessage = grade.equals("A") ? "Excellent!" :
                               (grade.equals("B")) ? "Grate" :
                               (grade.equals("C")) ? "Good job!" :
                               (grade.equals("D"))? "Bad" :
                               (grade.equals("E")) ? "Focus on studies" :
                               "Please see the teacher";

        // Output results
        System.out.println("Score: " + score);
        System.out.println("Grade: " + grade);
        System.out.println("Status: " + statusMessage);
        
        sc.close();
    }
}


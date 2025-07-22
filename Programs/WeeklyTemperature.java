package com;

public class WeeklyTemperature {

	    public static void main(String[] args) {
	        // Step 1: Declare and initialize array
	            int[] temperatures = {18,21,19,25,22,20,17};
	        // Step 2: Loop to find min, max, and sum
	            int max =temperatures[0];
	            int min =temperatures[0];
	            int sum =0;
	            int n = temperatures.length;
	            double avg = 0;;
	            for(int i=0 ;i<n ;i++){
	                if(temperatures[i] > max){
	                    max =temperatures[i];
	                }
	                if(temperatures[i] < min){
	                    min = temperatures[i];
	                }
	                sum+= temperatures[i];
	            }
	        // Step 3: Calculate average
	            
	                avg = (double) sum/n;

	        // Step 4: Print results
	        System.out.println("Highest temperature: "+max);
	        System.out.println("Lowest temperature: "+min);
	        System.out.printf("Average temperature: %.2f",avg);
	    }
	
}

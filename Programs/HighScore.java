package com.basic;

public class HighScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 92;
        int bonus = 16;
        
        // Don't modify the code below
        String status = "Regular Score";
        
        if (score >= 80 && score <= 100 && bonus >= 10 && bonus <= 20) {
            if ((score > 90 && bonus > 15) || (score > 85 && bonus > 18)) {
                status = "High Score";
            }
        } else {
            status = "Invalid Values";
        }
        
        System.out.println("Score: " + score);
        System.out.println("Bonus: " + bonus);
        System.out.println("Status: " + status);
	}

}

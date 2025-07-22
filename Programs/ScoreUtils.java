package com;

import java.util.Scanner;

public class ScoreUtils {

	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int score1 = sc.nextInt();
        int score2 = sc.nextInt();
        int score3 = sc.nextInt();
        sc.close();
        int result = getTopScore(score1, score2, score3);
        System.out.println(result);
    }
    public static int getTopScore(int score1, int score2, int score3){
        if(score1 >= score2 && score1 >= score3){
            return score1;
        }
        else if(score2 >= score1 && score2 >= score3){
            return score2;
        }
        else{
            return score3;
        }
       
    }
    
}

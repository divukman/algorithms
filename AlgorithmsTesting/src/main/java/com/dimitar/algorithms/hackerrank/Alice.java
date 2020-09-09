package com.dimitar.algorithms.hackerrank;

import java.util.*;

/**
 * https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
 */
public class Alice {


    public static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int [] result = new int[alice.length];

        //Stack
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < scores.length; i ++) {
            if (stack.empty()) {
                stack.push(scores[i]);
            } else if (stack.peek() != scores[i]) {
                stack.push(scores[i]);
            }
        }

        // Pop
        System.out.println("GOVNO");
        for (int i = 0; i < alice.length; i++) {
            while (!stack.empty() && stack.peek() <= alice[i]) {
                stack.pop();
            }
            result[i] = stack.size() + 1;
        }


       // Return result
        return result;
    }




    public static void main(String[] args) {
        int[] result = climbingLeaderboard(new int[] {100, 100, 50, 40, 40, 20,  10}, new int[] {5, 25, 50, 120});


        System.out.println("RESULT:");
        for (int i = 0; i < result.length; i++) {
            System.out.println(String.valueOf(result[i]));
        }
    }

}

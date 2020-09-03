package com.dimitar.algorithms.leetcode;

/**
 * https://leetcode.com/problems/water-bottles/
 */
public class WaterBottles {

    public static int numWaterBottles(int numBottles, int numExchange) {
        int result = numBottles;

        int divided = numBottles/numExchange;
        int reminder = numBottles % numExchange;

        while (divided > 0 || reminder >= numExchange) {
            result+=divided;
            divided = (divided + reminder) / numExchange;
            reminder = (divided + reminder) % numExchange;
        }

        return result;
    }

    public static int numWaterBottles2(int numBottles, int numExchange) {
        int result = numBottles;
        int step = result;

        do {
            int reminder = step % numExchange;
            step = step / numExchange;
            if (step > 0) {
             result += step;
             step = step + reminder;
            }
        } while (step > 0);

        return result;
    }

    public static void main(String[] args) {
       System.out.println(numWaterBottles(15, 8));
        System.out.println(numWaterBottles(15, 4));
        System.out.println(numWaterBottles(5, 5));
        System.out.println(numWaterBottles(2, 3));
        System.out.println("------------------------------------------");
        System.out.println(numWaterBottles2(15, 8));
        System.out.println(numWaterBottles2(15, 4));
        System.out.println(numWaterBottles2(5, 5));
        System.out.println(numWaterBottles2(2, 3));
    }
}

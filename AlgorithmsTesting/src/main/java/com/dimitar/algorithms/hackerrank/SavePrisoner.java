package com.dimitar.algorithms.hackerrank;

/**
 * https://www.hackerrank.com/challenges/save-the-prisoner/problem
 */
public class SavePrisoner {

    static int saveThePrisoner(int n, int m, int s) {
        int result = 0;


        int tmp = s +  (m - 1);
        if (tmp > n) {
            result = tmp % n == 0 ? n : tmp % n;
        } else {
            result = tmp;
        }

        return result;
    }


    public static void main(String[] args) {
        //System.out.println(saveThePrisoner(4, 6, 2));
        //System.out.println(saveThePrisoner(5, 2, 1));
        //System.out.println(saveThePrisoner(5, 2, 2));

        //System.out.println(saveThePrisoner(7, 19, 2));
        //System.out.println(saveThePrisoner(3, 7, 3));

      //  System.out.println(saveThePrisoner(5, 3, 5));
        System.out.println(saveThePrisoner(7, 19, 2));
        //3 394274638 3
        //System.out.println(saveThePrisoner(352926151 ,380324688 ,94730870)); //122129406
        //System.out.println(saveThePrisoner(999999999 ,999999999 ,1));
        //999999999 999999999 1 , 999999999
    }

}

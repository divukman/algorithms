package com.dimitar.algorithms.hackerrank;

//https://www.hackerrank.com/challenges/append-and-delete/problem
public class AppendAndDelete {

    public static boolean appendAndDelete(String s, String t, int k) {
        // safety checks
        if (s == null || t == null) return false;
        if (s.equals(t)) return true;
        if (k < 1) return false;

        s = s.trim();
        t = t.trim();


        boolean result = true;

        // find if one string starts with another
        final String shorter = s.length() <= t.length() ? s : t;
        final String longer = s.length() <= t.length() ? t : s;

        int steps = 0;
        int commonLen = 0;

        for (int i = 0; i < shorter.length(); i++) {
            if (shorter.charAt(i) == longer.charAt(i)) {
                commonLen++;
            } else {
                break;
            }
        }

        steps = shorter.length() - commonLen + longer.length() - commonLen;


        if (steps > k) {
            result = false;
        } else if (steps == k) {
            result = true;
        } else if (steps < k) {

            if (shorter.length() + longer.length() <= k) {
                result = true;
            } else if (steps % 2 == k % 2) {
                result = true;
            } else {
                result = false;
            }

        }

        return result;
    }


    public static String appendAndDelete2(String s, String t, int k) {
        int commonLength = 0;

        for (int i=0; i<java.lang.Math.min(s.length(),t.length());i++){
            if (s.charAt(i)==t.charAt(i))
                commonLength++;
            else
                break;
        }
//CASE A
        if((s.length()+t.length()-2*commonLength)>k){
            System.out.println("No");
        }
//CASE B
        else if((s.length()+t.length()-2*commonLength)%2==k%2){
            System.out.println("Yes");
        }
//CASE C
        else if((s.length()+t.length()-k)<0){
            System.out.println("Yes");
        }
//CASE D
        else{
            System.out.println("No");
        }

        return "";
    }


    public static void main(String[] args) {
        System.out.println("aba | aba in 7: " + appendAndDelete("aba", "aba", 7));
        System.out.println("y | yu in 2: " + appendAndDelete("y", "yu", 2));
        System.out.println("qwerasdf | qwerbsdf in 6: " + appendAndDelete("qwerasdf", "qwerbsdf", 6));
        System.out.println("hackerhappy | hackerrank in 9: " + appendAndDelete("hackerhappy", "hackerrank", 9));

        System.out.println("ashley | ash in 2: " + appendAndDelete("ashley", "ash", 2));
    }

}

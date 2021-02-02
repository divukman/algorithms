package com.dimitar.algorithms.mix;

import java.util.HashMap;

public class OneAway {

    // insert, remove, replace
    public static boolean isOneAway(final String str1, final String str2) {
        boolean result = true;

        final int diff = Math.abs(str1.length() - str2.length());

        if (diff == 0) {
            // Check replace

        } else if (diff == 1) {

        } else {
            result = false;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("pale, elp => " + isOneAway("pale","ple") );
        System.out.println("ple, bble => " + isOneAway("ple","bble") );
        System.out.println("pale, ple => " + isOneAway("pale","ple") );
        System.out.println("pales, pale => " + isOneAway("pales","pale") );
        System.out.println("pales, bale => " + isOneAway("pales","bale") );
        System.out.println("pales, bae => " + isOneAway("pales","bae") );
    }
}

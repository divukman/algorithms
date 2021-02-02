package com.dimitar.algorithms.mix;


public class OneAway {

    // insert, remove, replace

    /**
     * Check if strings are one edit, insert or replace away..
     *
     *
     * Idea:
     *  - If same length, then there has to be one character difference
     *  - If 1 character length difference, then take the longer one and check that
     *    there is only one character difference (sequence) from the shorter one
     *
     * @param str1
     * @param str2
     * @return true if one away, false otherwise
     */
    public static boolean isOneAway(final String str1, final String str2) {
        boolean result = true;

        final int lenDiff = Math.abs(str1.length() - str2.length());

        if (lenDiff > 1) {
            result = false;
        } else if (lenDiff == 1) {
            final String shorter = str1.length() < str2.length() ? str1 : str2;
            final String longer = str1.length() > str2.length() ? str1 : str2;

            int indexShorter = 0;
            int indexLonger = 0;

            int delta = 0;
            while (indexShorter < shorter.length() && indexLonger < longer.length()) {
                if (longer.charAt(indexLonger) == shorter.charAt(indexShorter)) {
                    indexLonger++;
                    indexShorter++;
                } else {
                    delta++;
                    if (delta > 1) {
                        result = false;
                        break;
                    }
                    indexLonger++;
                }
            }
        } else if (lenDiff == 0) {
            int delta = 0;
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    delta++;
                }
                if (delta > 1) {
                    result = false;
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("pale, elp => " + isOneAway("pale","elp") );
        System.out.println("ple, bble => " + isOneAway("ple","bble") );
        System.out.println("pale, ple => " + isOneAway("pale","ple") );
        System.out.println("pales, pale => " + isOneAway("pales","pale") );
        System.out.println("pales, bale => " + isOneAway("pales","bale") );
        System.out.println("pales, bae => " + isOneAway("pales","bae") );
    }
}

package com.dimitar.algorithms.hackerrank;

import java.io.IOException;

/**
 * https://www.hackerrank.com/challenges/repeated-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 */

public class RepeatedStrings {

    static long repeatedString(String s, long n) {
        if (s == null || s.length() == 0) return 0;

        final long sLen = s.length();
        final long sCount = s.chars().filter(i -> (char) i == 'a').count();
        final long noTimes = ( (long) (n / sLen) ) * (long)sCount;
        final long reminder = (long)(n % sLen);

        long result = noTimes + (int)s.substring(0, (int)reminder).chars().filter(i -> (char) i == 'a').count();
        return result;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(repeatedString("aba", 10));
        System.out.println(repeatedString("a", 1000000000000L));
    }
}

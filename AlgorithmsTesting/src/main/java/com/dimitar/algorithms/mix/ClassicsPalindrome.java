package com.dimitar.algorithms.mix;

public class ClassicsPalindrome {

    public static boolean isPalindrome(final String str) {
        boolean result = true;

        int first = 0;
        int last = str.length() - 1;

        do {
            final Character firstCharacter = Character.valueOf(str.charAt(first));
            final Character lastCharacter = Character.valueOf(str.charAt(last));

            if (!firstCharacter.equals(lastCharacter)) {
                result = false;
                break;
            }

            first++;
            last--;
        } while (first < last);

        return result;
    }

    public static void main(String[] args) {
        System.out.println("ANA :" + isPalindrome("ANA"));
        System.out.println("123ANA321 :" + isPalindrome("123ANA321"));
        System.out.println("JOHN :" + isPalindrome("JOHN"));
    }
}

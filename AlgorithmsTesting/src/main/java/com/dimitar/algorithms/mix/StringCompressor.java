package com.dimitar.algorithms.mix;

public class StringCompressor {

    public static String compress(final String str) {
        String result = str;

        StringBuffer stringBuffer = new StringBuffer(str.length());
        int pointer = 0;

        do {
            int counter = 1;

            while (pointer+1 < str.length() && (str.charAt(pointer+1) == str.charAt(pointer))) {
                counter++;
                pointer++;
            }
            stringBuffer.append(str.charAt(pointer) + String.valueOf(counter));
            pointer++;

        } while (pointer < str.length());

        result = stringBuffer.toString().length() < str.length() ? stringBuffer.toString() : str;
        //result = stringBuffer.toString();
        return result;
    }

    public static void main(String[] args) {
        System.out.println("abc: " + compress("abc"));
        System.out.println("aabbcc: " + compress("aabbcc"));
        System.out.println("aaabbccd: " + compress("aaabbccd"));

        System.out.println("aaaaabbbcddcd: " + compress("aaaaabbbcddcd"));
    }
}

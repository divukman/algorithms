package com.dimitar.algorithms.mix;

public class Compressor {

    public static String compress(final String str) {
        String result = str;
        final StringBuffer stringBuffer = new StringBuffer();

       int index = 0;
       do {
           int count = 1;
           stringBuffer.append(str.charAt(index));
           while (index < (str.length() -1)
                   && str.charAt(index) == str.charAt(index + 1)) {
               count++;
               index++;
           }
           stringBuffer.append(String.valueOf(count));
           index++;
       } while (index < str.length());

       result = result.length() < stringBuffer.toString().length() ? result : stringBuffer.toString();

        return result;
    }

    public static void main(String[] args) {
        System.out.println(compress("aaaaaaa"));
        System.out.println(compress("aabb"));
        System.out.println(compress("aabbccdddf"));
        System.out.println(compress("abcd"));
    }
}

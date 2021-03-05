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


    public static String compress2(final String str) {
        if (str == null || str.length() < 1) {
            return str;
        }

        final StringBuilder stringBuilder = new StringBuilder();
        int counter = 0;

        int ptr = 0;
        final int size = str.length();

        while (ptr < size) {
            counter++;
            final Character current = str.charAt(ptr);
            while (ptr + 1 < size && current.equals(str.charAt(ptr + 1))) {
                counter++;
                ptr++;
            }
            stringBuilder.append(current);
            stringBuilder.append(String.valueOf(counter));
            counter = 0;
            ptr++;
        }

        return str.length() < stringBuilder.toString().length() ? str : stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(compress2("aaaaaaa"));
        System.out.println(compress2("aabb"));
        System.out.println(compress2("aabbccdddf"));
        System.out.println(compress2("abcd"));
    }
}

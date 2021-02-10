package com.dimitar.algorithms.mix;

public class StripZeros {

    public static String stripZeros(final String str) {
        if (str == null || str.length() < 1) {
            return "";
        } else if (str.startsWith("0")) {
            return stripZeros(str.substring(1));
        } else {
          return str;
        }
    }

    public static void main(String[] args) {
        System.out.println(stripZeros("00001"));
        System.out.println(stripZeros("010001"));
        System.out.println(stripZeros("100001"));
        System.out.println(stripZeros("021"));
    }

}

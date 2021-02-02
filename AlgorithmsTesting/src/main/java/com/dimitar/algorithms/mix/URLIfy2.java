package com.dimitar.algorithms.mix;

import java.net.URL;

public class URLIfy2 {

    public static String URLIfy(final String str) {
        return str.replaceAll(" ", "%20");
    }

    public static String URLIfy2(final String str) {
        final StringBuffer buffer = new StringBuffer();
        final String SPACE = "%20";

        for (int i = 0; i < str.length(); i++) {
            final Character character = str.charAt(i);
            if (Character.isSpaceChar(character)) {
                buffer.append(SPACE);
            } else {
                buffer.append(character.toString());
            }
        }

        return buffer.toString();
    }

    public static void main(String[] args) {
        System.out.println(URLIfy("this is a string"));
        System.out.println(URLIfy2("this is a string"));
    }
}

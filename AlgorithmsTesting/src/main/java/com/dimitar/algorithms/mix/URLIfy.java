package com.dimitar.algorithms.mix;

public class URLIfy {

    public static String urlify(final String input) {
        return input.replaceAll(" ", "%20");
    }

    public static String urlify2(final String input, final int finalLen) {
       String result = null;
       char arr[] = new char[finalLen];

       int pointer = 0;
       for (int i = 0; i < input.length(); i++) {
           if (input.charAt(i) != ' ') {
               arr[pointer++] = input.charAt(i);
           } else { // There is a space char
               arr[pointer++] = '%';
               arr[pointer++] = '2';
               arr[pointer++] = '0';
           }
       }

       result = new String(arr);
       return result;
    }

    public static void main(String[] args) {
        System.out.println("THIS IS A STRING: " + urlify("THIS IS A STRING"));
        System.out.println("THIS IS A STRING: " + urlify2("THIS IS A STRING", 22));
    }
}

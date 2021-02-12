package com.dimitar.algorithms.mix;

import java.util.Scanner;

public class StringReverse {

    public static String reverse(final String input) {
        final StringBuffer buffer = new StringBuffer();

        int lastPtr = input.length() - 1;
        while(lastPtr >= 0) {
            buffer.append(input.charAt(lastPtr));
            lastPtr--;
        }

        return buffer.toString();
    }

    public static String reverse2(final String str) {
        final char[] arr = str.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        for (; left < right; left++, right--) {
            final char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        final String str = scanner.nextLine();

        System.out.println("Reversed string: ");
        System.out.println("-------------------------------");
        System.out.println(reverse2(str));
    }
}

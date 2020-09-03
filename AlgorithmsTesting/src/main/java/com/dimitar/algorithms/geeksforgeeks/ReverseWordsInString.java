package com.dimitar.algorithms.geeksforgeeks;

import java.util.Scanner;

public class ReverseWordsInString {

    public static void main (String[] args) {
       final Scanner scanner = new Scanner(System.in);
       int T = scanner.nextInt();
       scanner.nextLine();

       while (T-- > 0) {
           final String strInput = scanner.nextLine();

           final String[] split = strInput.split("\\.");
           StringBuffer buffer = new StringBuffer();
           for (int i = split.length - 1; i >= 0; i--) {
               buffer.append(split[i]);
               if (i != 0) buffer.append(".");
           }

           System.out.println(buffer.toString());
       }
    }

}

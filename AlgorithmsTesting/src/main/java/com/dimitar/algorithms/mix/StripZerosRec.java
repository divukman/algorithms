package com.dimitar.algorithms.mix;

public class StripZerosRec {

    public static String stripZeros(String text) {
        if (!text.startsWith("0")) {
            return text;
        }
        return stripZeros(text.substring(1));
    }

    public static void main(String[] args) {
        System.out.println("0001: " + stripZeros("0001") );
        System.out.println("0011: " + stripZeros("0011") );
        System.out.println("00001989: " + stripZeros("00001989") );
        System.out.println("VOD: " + stripZeros("VOD") );
    }
}

package com.dimitar.algorithms.hackerrank;

import java.util.HashMap;

// https://www.hackerrank.com/challenges/designer-pdf-viewer/problem
public class PDFViewer {
    public static HashMap<Character,Integer> alphabet = new HashMap<>();
    static {
        //A, B, C, D, E,
        alphabet.put(Character.valueOf('a'), 0);
        alphabet.put(Character.valueOf('b'), 1);
        alphabet.put(Character.valueOf('c'), 2);
        alphabet.put(Character.valueOf('d'), 3);
        alphabet.put(Character.valueOf('e'), 4);

        // F, G, H, I, J,
        alphabet.put(Character.valueOf('f'), 5);
        alphabet.put(Character.valueOf('g'), 6);
        alphabet.put(Character.valueOf('h'), 7);
        alphabet.put(Character.valueOf('i'), 8);
        alphabet.put(Character.valueOf('j'), 9);

        //K, L, M, N, O,
        alphabet.put(Character.valueOf('k'), 10);
        alphabet.put(Character.valueOf('l'), 11);
        alphabet.put(Character.valueOf('m'), 12);
        alphabet.put(Character.valueOf('n'), 13);
        alphabet.put(Character.valueOf('o'), 14);

        // P, Q, R, S, T,
        alphabet.put(Character.valueOf('p'), 15);
        alphabet.put(Character.valueOf('q'), 16);
        alphabet.put(Character.valueOf('r'), 17);
        alphabet.put(Character.valueOf('s'), 18);
        alphabet.put(Character.valueOf('t'), 19);

        //U, V, W, X, Y, Z.
        alphabet.put(Character.valueOf('u'), 20);
        alphabet.put(Character.valueOf('v'), 21);
        alphabet.put(Character.valueOf('w'), 22);
        alphabet.put(Character.valueOf('x'), 23);
        alphabet.put(Character.valueOf('y'), 24);
        alphabet.put(Character.valueOf('z'), 25);
    }

    // Complete the designerPdfViewer function below.
    static int designerPdfViewer(int[] h, String word) {
        int area = 0;

        final int length = word.length();
        int maxHeight = -1;
        for (int i = 0; i < word.length(); i++) {
            final int index = alphabet.get(Character.valueOf(word.charAt(i)));
            final int height = h[index];

            if (maxHeight < height) {
                maxHeight = height;
            }
        }

        area = maxHeight * length;

        return area;
    }

    public static void main(String[] args) {
        final int [] heights = new int[] {
                1, 3, 1, 3, 1, 4, 1, 3, 2, 5,
                5, 5, 5, 5, 5, 5, 5, 5, 5, 5,
                5, 5, 5, 5, 5, 5};

        final int [] h2 = new int[] {
                6, 5, 7, 3, 6,
                7, 3, 4, 4, 2,
                3, 7, 1, 3, 7,
                4, 6, 1, 2, 4,
                3, 3, 1, 1, 3, 5
        };

        final String word = "zbkkfhwplj";

        System.out.println(word);
        System.out.println("area: " + designerPdfViewer(h2, word));

    }

}

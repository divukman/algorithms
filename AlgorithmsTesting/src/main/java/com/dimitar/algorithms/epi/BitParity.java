package com.dimitar.algorithms.epi;

/**
 * The parity of a binary word is 1 if the number of Is in the word is odd; otherwise,
 * it is 0. For example, the parity of 1011 is 1, and the parity of 10001000 is 0. Parity
 * checks are used to detect single bit errors in data storage and communication. It is
 * fairly straightforward to write code that computes the parity of a single 64-bit word.
 * 45
 */
public class BitParity {

    public static short parity(long number) {
        short result = 0;

        while (number != 0) {
            short lastBit = (short) (number & 1);
            result = (short) (result ^ lastBit);
            number = number >>> 1;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("Parity for 1001: " + parity(9));
        System.out.println("Parity for 1011: " + parity(11));
    }
}

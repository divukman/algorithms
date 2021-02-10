package com.dimitar.algorithms.mix;

public class CaesarCipher {

    public static String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static int ALPHABET_SIZE = ALPHABET.length();

    public static String encrypt(final String input, final int n) {
        final StringBuffer stringBuffer = new StringBuffer();

        for (int i = 0; i < input.length(); i ++) {
            final Character character = input.charAt(i);
            if (Character.isSpaceChar(character)) {
                stringBuffer.append(character);
            } else {
                final int currentIndex = ALPHABET.indexOf(character);
                int cipherIndex = (currentIndex + n) % ALPHABET_SIZE;
                final Character encryptedCharacter = ALPHABET.charAt(cipherIndex);
                stringBuffer.append(encryptedCharacter);
            }
        }

        return stringBuffer.toString();
    }

    public static String decrypt(final String input, final int n) {
        final StringBuffer stringBuffer = new StringBuffer();

        for (int i = 0; i < input.length(); i ++) {
            final Character character = input.charAt(i);
            if (Character.isSpaceChar(character)) {
                stringBuffer.append(character);
            } else {
                final int currentIndex = ALPHABET.indexOf(character);
                int cipherIndex = (currentIndex - n) % ALPHABET_SIZE;
                if (cipherIndex < 0) cipherIndex = ALPHABET_SIZE + cipherIndex;
                final Character encryptedCharacter = ALPHABET.charAt(cipherIndex);
                stringBuffer.append(encryptedCharacter);
            }
        }

        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        final String encrypted = encrypt("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG", 23);
        System.out.println(encrypted);

        final String decrypted = decrypt(encrypted, 23);
        System.out.println(decrypted);
    }
}

package com.dimitar.algorithms.mix;

import java.util.HashMap;

public class RansomNote {

    public static boolean canWrite(final String note, final String letters) {
        boolean result = true;

        final HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < letters.length(); i++) {
            final Character character = letters.charAt(i);
            int counter = hashMap.getOrDefault(character, 0);
            hashMap.put(character, counter + 1);
        }

        for (int i = 0; i < note.length(); i++) {
            final Character character = note.charAt(i);
            if (Character.isSpaceChar(character)) continue;
            int counter = hashMap.getOrDefault(character, 0);
            if (counter == 0) {
                result = false;
                break;
            } else {
                hashMap.put(character, counter - 1);
            }
        }


        return result;
    }


    public static void main(String[] args) {
        final String note = "Pay me $1000";
        final String letters = "ayPem0001$YYZT(";
        final String letters2 = "yPem0001$YYZT(";

        System.out.println("Note `" + note + "` can be written using letters: `" + letters+  "` : " + canWrite(note, letters));
        System.out.println("Note `" + note + "` can be written using letters: `" + letters2+  "` : " + canWrite(note, letters2));
    }

}

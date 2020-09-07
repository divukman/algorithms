package com.dimitar.algorithms.mix;

// Challenge: Give a string with repeating characters (i.e. "aaabb") write
// an algorithm that will compress the string down to the character, followed
// by the number of times it appears in the string (i.e "a3b2").
// If the compressed string is not smaller than original, return original.


public class StringCompress {

    public static String compress(final String str) {
        String result = null;
        StringBuffer stringBuffer = new StringBuffer();

        Character previous = str.charAt(0);
        int counter = 1;
        if (str.length() == 1) {
            stringBuffer.append(previous.toString());
            stringBuffer.append(counter);
        } else {
            for (int i = 1; i < str.length(); i++) {
                Character current = str.charAt(i);
                if (current.equals(previous)) {
                    counter++;
                } else {
                    stringBuffer.append(previous.toString());
                    stringBuffer.append(counter);
                    counter = 1;
                }

                if (i == (str.length() - 1)) {
                    stringBuffer.append(current.toString());
                    stringBuffer.append(counter);
                }

                previous = current;
            }
        }

       // System.out.println(stringBuffer.toString());

        result = stringBuffer.toString().length() < str.length() ?  stringBuffer.toString() : str;
        return result;
    }


    public static String compress2(final String str) {
        String result = null;

        final StringBuffer stringBuffer = new StringBuffer();
        int ptr = 0;
        int counter = 0;

        if (str == null) return "";
        if (str.length() == 1) return str;

        // string length 2+
        do {
            counter++;
            while ( (ptr + 1 < str.length()) && str.charAt(ptr + 1) == str.charAt(ptr) ) {
                counter++;
                ptr++;
            }

            stringBuffer.append(str.charAt(ptr));
            stringBuffer.append(String.valueOf(counter));
            counter = 0;
            ptr++;
        } while (ptr < str.length());

        result = str.length() > stringBuffer.toString().length() ? stringBuffer.toString() : str;

        return result;
    }

    public static void main(String[] args) {
       System.out.println("aaabb to a3b2 -> " + compress("aaabb") );
       System.out.println("aaabbcaaad to a3b2c1a3d1 -> " + compress("aaabbcaaad") );
       System.out.println("aaabbcaaaddd to a3b2c1a3d3 -> " + compress("aaabbcaaaddd") );

        System.out.println("----------------------------------------------------------------");
        System.out.println("aaabb to a3b2 -> " + compress2("aaabb") );
        System.out.println("aaaab to a4b1 -> " + compress2("aaaab") );
        System.out.println("aaabbcaaad to a3b2c1a3d1 -> " + compress2("aaabbcaaad") );
        System.out.println("aaabbcaaaddd to a3b2c1a3d3 -> " + compress2("aaabbcaaaddd") );
    }
}

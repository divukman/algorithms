package com.dimitar.algorithms.leetcode;

/**
 * https://leetcode.com/problems/longest-common-prefix/
 */
public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        // Safety catch
        if (strs == null || strs.length == 0 || strs[0] == null || strs[0].length() == 0) return "";


        StringBuffer stringBuffer = new StringBuffer();
        final String firstString = strs[0];

        for (int i = 0; i < firstString.length(); i++) {
            final Character character = firstString.charAt(i);

            boolean matchFound = true;
            for (int j = 1; j < strs.length; j++) {
                final String str = strs[j];
                if (str == null || str.length() > i) {
                    if (str.charAt(i) != character) {
                        matchFound = false;
                        break;
                    }
                } else {
                    matchFound = false;
                    break;
                }
            }
            if (matchFound) {
                stringBuffer.append(character);
            } else {
                break;
            }
        }


        return stringBuffer.toString();
    }

    public static void main(String[] args) {
       String [] strArr1 = {"flower", "flow", "flight"};
        String [] strArr2 = {"dog", "racecar", "car"};
        String [] strArr3 = {"enterprise", "enter", "entering", "entertainment"};
        String [] strArr4 = {"aa", "a"};

       // System.out.println(longestCommonPrefix(strArr1));
      //  System.out.println(longestCommonPrefix(strArr2));
      //  System.out.println(longestCommonPrefix(strArr3));
        System.out.println(longestCommonPrefix(strArr4));
    }
}

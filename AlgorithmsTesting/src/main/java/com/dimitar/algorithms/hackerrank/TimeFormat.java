package com.dimitar.algorithms.hackerrank;



import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * https://www.hackerrank.com/challenges/time-conversion/problem
 */
public class TimeFormat {

    public static String leftPadZeros(String input) {
        if (input.length() >= 2) return input;
        else return leftPadZeros("0"+input);
    }

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        String result = null;

        // Pull out the values from the input string
        String[] split = s.split(":");
        boolean isPM = split[2].contains("PM");
        String strSeconds = split[2].substring(0, 2);

        int hours = Integer.valueOf(split[0]);
        if (hours != 12 && isPM) hours+=12;
        else if (hours == 12 && !isPM) hours=0;

        String strHours = leftPadZeros(String.valueOf(hours));
        String strMinutes = split[1];

        result = strHours + ":" + strMinutes + ":" + strSeconds;
        return result;
    }

    public static void main(String[] args) {
        System.out.println("07:05:45PM : " + timeConversion("07:05:45PM"));
        System.out.println("12:00:00PM : " + timeConversion("12:00:00PM"));
        System.out.println("12:00:00AM : " + timeConversion("12:00:00AM"));
    }
}

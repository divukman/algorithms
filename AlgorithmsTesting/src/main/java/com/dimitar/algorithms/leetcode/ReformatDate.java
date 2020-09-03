package com.dimitar.algorithms.leetcode;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * https://leetcode.com/problems/reformat-date/
 */
public class ReformatDate {

    public static HashMap<String, String> MONTH = new HashMap<>();
    static {
        MONTH.put("Jan", "01");
        MONTH.put("Feb", "02");
        MONTH.put("Mar", "03");
        MONTH.put("Apr", "04");
        MONTH.put("May", "05");
        MONTH.put("Jun", "06");
        MONTH.put("Jul", "07");
        MONTH.put("Aug", "08");
        MONTH.put("Sep", "09");
        MONTH.put("Oct", "10");
        MONTH.put("Nov", "11");
        MONTH.put("Dec", "12");
    }

    /**
     *
     * @param date "20th Oct 2052"
     * @return "2052-10-20"
     */
    public static String reformatDate(String date) {
        String result = null;

        String [] split = date.split(" ");

        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(split[0]);

        if (m.find()) {
            String daystr = m.group();
            if (daystr.length() < 2) {
                daystr = "0" + daystr;
            }
            result = split[2] + "-" + MONTH.get(split[1]) + "-" + daystr;
        }

        return result;
    }


    public static void main(String[] args) {

        System.out.println(reformatDate("22nd Apr 2023"));
//        System.out.println(reformatDate("6th Jun 1933"));
//        System.out.println(reformatDate("26th May 1960"));
//        System.out.println(reformatDate("6th Jun 1933"));



    }
}

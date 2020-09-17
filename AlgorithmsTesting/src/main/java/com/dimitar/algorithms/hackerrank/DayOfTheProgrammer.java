package com.dimitar.algorithms.hackerrank;

/**
 * https://www.hackerrank.com/challenges/day-of-the-programmer/problem
 */
public class DayOfTheProgrammer {

    public static final int DAY = 256;
    public static final int CROSSOVER_YEAR = 1918; //31st Jan -> next day to 14th Feb ie Feb 14 was 32nd day of that year
    //public static final int [] MONTHS = new int[12];

   /* static {
        MONTHS[0] = 31;
        MONTHS[1] = 28; // Feb could be 28 or 29
        MONTHS[2] = 31;
        MONTHS[3] = 30;
        MONTHS[4] = 31;
        MONTHS[5] = 30;
        MONTHS[6] = 31;
        MONTHS[7] = 31;
        MONTHS[8] = 30;
        MONTHS[9] = 31;
        MONTHS[10] = 30;
        MONTHS[11] = 31;
    }*/


    /**
     * Receives a year, returns a date on that day in string in dd.mm.yyyy format for Russia.
     * @param year - year number
     * @return - date on 'programmers day' in string in dd.mm.yyyy format for Russia
     */
    static String dayOfProgrammer(int year) {
        StringBuilder result = new StringBuilder();

        // First find out if this is a leap year
        final boolean isLeapYear = year < CROSSOVER_YEAR ?
                (year % 4 == 0) :
                (year % 400 == 0 ||  (year % 4 == 0 && !(year % 100 == 0)) );

        final int first8MonthsSum = 243 + (isLeapYear ? 1 : 0);
        final int first8MonthsSum1918 = 230 + (isLeapYear ? 1 : 0);

        int month = 9;
        int day = 0;
        // 1918 Feb14 32day!
        if (year == CROSSOVER_YEAR) {
            day = DAY - first8MonthsSum1918;
        } else {
            day = DAY - first8MonthsSum;
        }

        String strDay = stringPad(String.valueOf(day), Character.valueOf('0'), 2);
        String strMonth = stringPad(String.valueOf(month), Character.valueOf('0'), 2);

        result.append(strDay).append(".").append(strMonth).append(".").append(year);

        return result.toString();
    }

    public static String stringPad(String str, Character character, int len) {
        if (str.length() >= len) return str;
        else return stringPad(character + str, character, len);
    }

    public static void main(String[] args) {
        System.out.println("2017 -> " + dayOfProgrammer(2017)); // 13.09.2017
        System.out.println("2016 -> " + dayOfProgrammer(2016)); // 12.09.2016
        System.out.println("1800 -> " + dayOfProgrammer(1800)); // 12.09.1800
        System.out.println("1918 -> " + dayOfProgrammer(1918));
    }
}

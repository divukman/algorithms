package com.dimitar.algorithms.hackerrank;

// https://www.hackerrank.com/challenges/library-fine/problem
public class LibraryFine {

    // Complete the libraryFine function below.
    static int libraryFine(int d1, int m1, int y1, //return
                           int d2, int m2, int y2) { // due
        int result = 0;

        if (y1 > y2) {
            result = 10000;
        } else if (y1 == y2) {
            if (m2 == m1 && d1 > d2) {
                result = (d1 - d2) * 15;
            } else if (m1 > m2) {
                result = (m1 - m2) * 500;
            }
        }

        return result;
    }



    public static void main(String[] args) {
    /*    System.out.println("Library fine for: 9 6 2015\n" +
                ", 6 6 2015: ");

        final int fine = libraryFine(
                9, 6, 2015,
                6, 6, 2015);
        System.out.println(fine);


        System.out.println("Library fine for: 14 7 2018\n" +
                ", 5 7 2018: ");

        final int fine2 = libraryFine(
                14, 7, 2018,
                5, 7, 2018);
        System.out.println(fine2);

*/
        System.out.println("Library fine for: 2 6 2014\n" +
                ", 5 7 2014: ");

        final int fine3 = libraryFine(
                2, 6, 2014,
                5, 7, 2014);
        System.out.println(fine3);
    }
}

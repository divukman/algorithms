package com.dimitar.algorithms.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/grading/problem
 */
public class GradingStudents {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */
    public static List<Integer> gradingStudents(List<Integer> grades) {
        final List<Integer> result = new ArrayList<>(grades.size());

        for (int i = 0; i < grades.size(); i++) {
            final Integer grade = grades.get(i);
            if (grade < 38) {
                result.add(grade);
            } else {
                final Integer roundup = ((grade / 5) + 1) * 5;
                final Integer delta = roundup - grade;
                if (delta < 3) {
                    result.add(roundup);
                } else {
                    result.add(grade);
                }
            }
        }

        return result;
    }


    public static void main(String[] args) {
        final List<Integer> result1 = gradingStudents(Arrays.asList(new Integer[] {73, 67, 38, 33})); //75 67 40 33
        result1.stream().forEach(System.out::println);
    }
}

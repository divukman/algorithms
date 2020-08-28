package com.dimitar.algorithms.hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

/**
 * https://www.hackerrank.com/challenges/counting-valleys/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 */
public class CountingValleys {
    private static final Scanner scanner = new Scanner(System.in);


    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int result = 0;
        final Stack<Character> stack = new Stack<>();
        boolean isInValley = false;

        for (int i = 0; i < s.length(); i ++) {
            final Character character = s.charAt(i);

            if (stack.isEmpty()) {
                isInValley = character.charValue() == 'D'; // empty stack and going down
            }

            if (stack.empty()) {
                stack.push(character);
                continue;
            }

            final Character top = stack.peek();
            if (top.charValue() != character.charValue()) {
                stack.pop();
                if (stack.isEmpty() && isInValley) {
                    result++;
                }
            } else {
                stack.push(character);
            }
        }

        return result;
    }


    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        System.out.println(String.valueOf(result));

        scanner.close();
    }
}

package com.dimitar.algorithms.mix;

public class ClassicsFizzBuzz {

    public static void fizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            String result = String.valueOf(i);

            if (i % 3 == 0 && i % 5 == 0) {
                result = "FizzBuzz";
            } else if (i % 5 == 0) {
                result = "Buzz";
            } else if (i % 3 == 0) {
                result = "Fizz";
            }

            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        fizzBuzz();
    }
}

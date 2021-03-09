package com.dimitar.algorithms.hackerrank;

//https://www.hackerrank.com/challenges/strange-advertising/problem
public class ViralAdvertising {

    final static int N = 10001;
    final static int cache[] = new int[N];

    public static int func(final int day) {
        if (day == 1) return 2;

        if (day < N) {
            if (cache[day] != 0) return cache[day];
            cache[day] = (func (day - 1)  * 3 ) / 2;
        } else {
            return (func (day - 1)  * 3 ) / 2;
        }

        return  cache[day];
    }

    // Complete the viralAdvertising function below.
    static int viralAdvertising(int n) {
        int sum = 0;
        for (int i = 1; i <=n; i++) {
            sum += func(i);
        }

        return sum;
    }


    // Complete the viralAdvertising function below.
    static int viralAdvertising2(int n) {
        int people = 5;
        int liked = 0;

        for (int i = 1; i <= n; i++) {
            int half = people /2;
            liked+= half;
            people = half * 3;
        }

        return liked;
    }


    public static void main(String[] args) {
        System.out.println(viralAdvertising2(5));
    }

}

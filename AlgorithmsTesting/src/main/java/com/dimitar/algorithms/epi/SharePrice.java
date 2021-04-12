package com.dimitar.algorithms.epi;

// pg1 -> calculate stock buy/sell profit
public class SharePrice {

    public static float bruteForce(final float [] arr) {
        float result = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i +1; j < arr.length; j++) {
                System.out.println("i,j: " + arr[i] + ", " + arr[j]);
                final float start = arr[i];
                final float end = arr[j];
                if (end - start > result) result = end - start;
            }
            System.out.println("---------------");
        }

        return result;
    }


    public static float min(final float [] arr, final int start, final int end) {
        float min = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] < min) min = arr[i];
        }
        return min;
    }

    public static float max(final float [] arr, final int start, final int end) {
        float max = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }

    public static float divideAndConquer(final float [] arr, final int startIndex, final int endIndex) {
        if (startIndex >= endIndex) {
            return 0;
        } else if (startIndex + 1 == endIndex) {
            return arr[endIndex] - arr[startIndex];
        }

        final int leftArrStartIndex = startIndex;
        final int leftArrEndIndex =  (startIndex + endIndex) / 2;

        final int rightArrStartIndex = leftArrEndIndex + 1;
        final int rightArrEndIndex = endIndex;

        float maxDivide = Math.max( divideAndConquer(arr, leftArrStartIndex, leftArrEndIndex), divideAndConquer(arr, rightArrStartIndex, rightArrEndIndex));
        float maxLeftRight = max(arr,rightArrStartIndex,rightArrEndIndex) - min (arr, leftArrStartIndex, leftArrEndIndex );

        return Math.max(maxDivide, maxLeftRight);
    }


    public static float logic(final float [] arr) {
        float result = 0;

        float min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else {
                final float delta = arr[i] - min;
                result = delta > result ? delta : result;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        final float prices[] = new float[] {4, 5, 3, 4, 6 , 2};


        System.out.println("Brute force result: O(n2): " + bruteForce(prices));

        System.out.println("Divide and conquer: O(nlogn): " + divideAndConquer(prices, 0, prices.length - 1));

        System.out.println("Logic: O(n): " + logic(prices));
    }

}

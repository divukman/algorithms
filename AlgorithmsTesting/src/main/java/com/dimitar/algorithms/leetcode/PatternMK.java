package com.dimitar.algorithms.leetcode;

/**
 * https://leetcode.com/problems/detect-pattern-of-length-m-repeated-k-or-more-times/
 *
 * @see: https://www.youtube.com/watch?v=K0Yw1L5zuDY
 */
public class PatternMK {

    public static boolean containsPattern(int[] arr, int m, int k) {

        for (int i = 0; i < arr.length; i++) {
            if (i + m < arr.length) {
                int ptr = i;
                int pattern[] = new int[m];
                int patternArrCounter = 0;
                for (int j = i; j < i+m; j++) {
                    pattern[patternArrCounter++] = arr[j];
                }

                System.out.print("pattern: " );
                printArr(pattern);
                System.out.println();
                ptr = i+m;

                // Count this pattern repetitions from here till end
                int counter = 1; // First
                while (ptr + m <= arr.length) {
                    int subPattern[] = new int[m];
                    int subPatternArrCounter = 0;
                    for (int z = ptr; z < ptr + m; z++) {
                        subPattern[subPatternArrCounter++] = arr[z];
                    }
                    ptr+=m;
                    if (compareArrays(pattern, subPattern)) {
                        counter++;
                        if (counter==k) {
                            return true;
                        }
                    } else {
                        break;
                    }
                }


            } else {
                break;
            }
        }

        return false;
    }


    public static boolean containsPattern2(int[] arr, int m, int k) {
        int counter=0;
        for(int i=0; i+m < arr.length; i++) {
            if (arr[i] != arr[i+m]) {
                counter = 0;
            } else {
                counter++;
                if (counter == (k-1)*m) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i< arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static boolean compareArrays(int arr1[], int arr2[]) {
        if (arr1.length != arr2.length) {
            return false;
        }
        if (arr1.length == 0 && arr2.length == 0) {
            return true;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
         System.out.println("true? " + containsPattern2(new int [] {1,2,4,4,4,4}, 1, 3));

        System.out.println("true? " + containsPattern2(new int [] {1,2,1,2,1,1,1,3}, 2, 2));

        System.out.println("false? " + containsPattern2(new int [] {1,2,1,2,1,3}, 2, 3));

         System.out.println("true? " + containsPattern2(new int [] {3,2,1,3,3,2,1,3,3,1,2,3,3,2,1,3,2,1,1}, 1, 2));
    }

}

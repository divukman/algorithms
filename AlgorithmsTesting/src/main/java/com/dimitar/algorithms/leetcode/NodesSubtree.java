package com.dimitar.algorithms.leetcode;

import java.util.HashMap;

/**
 * https://leetcode.com/problems/number-of-nodes-in-the-sub-tree-with-the-same-label/
 *
 * @todo: works fine on PC, stack overflow on submit
 * NB Algorithm is more or less sound (could go from back N-1 to zero for hash),
 * this is what they provide for an matrix
 *
 *
 * 4
 * [[0,1],[1,2],[0,3]]
 * "bbbb"
 * on mapira ovako
 * INPUT : i : 0 j: 0 VAL: 0
 * INPUT : i : 0 j: 1 VAL: 1
 * INPUT : i : 1 j: 0 VAL: 1
 * INPUT : i : 1 j: 1 VAL: 2
 * INPUT : i : 2 j: 0 VAL: 0
 * INPUT : i : 2 j: 1 VAL: 3
 *
 *
 * I have no idea how they come up with this input. With proper input, recursions are good. Leaving it as is.
 */
public class NodesSubtree {

    public static HashMap<Integer, HashMap<Character, Integer>> hash = new HashMap<>();

    public static int countRec(int n, int[][] edges, String labels, Character l) {
       int node = n;
       int counter = 0;

       if (hash.containsKey(Integer.valueOf(n))) {
           HashMap<Character, Integer> nodeHash = hash.get(Integer.valueOf(n));
           if (nodeHash.containsKey(l)) return nodeHash.get(l);
       }

       if (l.equals(labels.charAt(n))) {
           counter++;

           //find children
           int [] children = edges[n];
            int childrenSum = 0;
           for (int i = 0; i < children.length; i++) {
               if (children[i] > 0) {
                   childrenSum +=   countRec(i, edges, labels, l);
               }
           }

           HashMap<Character, Integer> nodeHash = null;
           if (hash.containsKey(Integer.valueOf(n))) {
               nodeHash = hash.get(Integer.valueOf(n));
           } else {
               nodeHash = new HashMap<>();
           }
           nodeHash.put(l, childrenSum + counter);

           return childrenSum + counter;

       } else return counter;

    }

    public static int[] countSubTrees(int n, int[][] edges, String labels) {


        for (int i = 0; i < edges.length; i++) {
            int arr[] = edges[i];
            for (int j = 0; j < arr.length; j++) {
                System.out.println("INPUT : i : " + i + " VAL: " + arr[j]);
            }
        }

        int [] result = new int[labels.length()];

        for (int i = 0; i < labels.length(); i++) {

            result[i] = countRec(i, edges, labels, labels.charAt(i));
        }


        return result;
    }

    public static void main(String[] args) {
/*
        // Example 1
        boolean [] [] edges2 = new boolean[7][7];
        edges2[0][1] = true;
        edges2[0][2] = true;
        edges2[1][4] = true;
        edges2[1][5] = true;
        edges2[2][3] = true;
        edges2[2][6] = true;
        int [] result2 = countSubTrees(7, edges2, "abaedcd"); //Output: [2,1,1,1,1,1,1]

        for (int i = 0; i < result2.length; i++) {
            System.out.println( result2[i] + " ");
        }
*/

  /*      // Example 2
        boolean [] [] edges = new boolean[4][4];
        edges[0][1] = true;
        edges[1][2] = true;
        edges[0][3] = true;

        int [] result = countSubTrees(4, edges, "bbbb");

        for (int i = 0; i < result.length; i++) {
            System.out.println( result[i] + " ");
        }


        System.out.println("----------------------------------------------");*/



        /*// Example 3
        boolean [] [] edges3 = new boolean[5][5];
        edges3[0][1] = true;
        edges3[0][2] = true;
        edges3[1][3] = true;
        edges3[0][4] = true;

        int [] result3 = countSubTrees(4, edges3, "aabab");

        for (int i = 0; i < result3.length; i++) {
            System.out.println( result3[i] + " ");
        }
        System.out.println("----------------------------------------------");*/

        // Example 4
        int [] [] edges4 = new int[7][7];
        edges4[0][1] = 1;
        edges4[0][2] = 1;
        edges4[1][4] = 1;
        edges4[1][5] = 1;
        edges4[2][3] = 1;
        edges4[2][6] = 1;

        int [] result4 = countSubTrees(6, edges4, "abaedcd");

        for (int i = 0; i < result4.length; i++) {
            System.out.println( result4[i] + " ");
        }
        System.out.println("----------------------------------------------");


    }
}

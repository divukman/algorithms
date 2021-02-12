package com.dimitar.algorithms.amazon;

/**
 * L1 2, 5, 8, 11, 14
 * L2 1, 3, 5, 7
 *
 * R 1, 2, 3, 5, 5, 7, 8, 11, 14
 */
public class PackageLists {

    public static int [] combinePackageLists(final int[] l1, final int [] l2) {
        final int size1 = l1.length;
        final int size2 = l2.length;
        final int sizeR = size1 + size2;

        final int [] result = new int [sizeR];

        int ptrL1 = 0;
        int ptrL2 = 0;
        int ptrR = 0;

        while (ptrL1 < size1 && ptrL2 < size2) {
            if (l1[ptrL1] < l2[ptrL2]) {
                result[ptrR] = l1[ptrL1];
                ptrR++;
                ptrL1++;
            } else if(l1[ptrL1] == l2[ptrL2]) {
                result[ptrR] = l1[ptrL1];
                ptrR++;
                result[ptrR] = l1[ptrL1];
                ptrR++;

                ptrL1++;
                ptrL2++;
            } else {
                result[ptrR] = l2[ptrL2];
                ptrR++;
                ptrL2++;
            }
        }

        if (ptrL1 < size1) {
            while (ptrL1 < size1) {
                result[ptrR] = l1[ptrL1];
                ptrR++;
                ptrL1++;
            }
        } else if (ptrL2 < size2) {
            while (ptrL2 < size2) {
                result[ptrR] = l2[ptrL2];
                ptrR++;
                ptrL2++;
            }
        }

        return result;
    }

    private static void printList(final int[] list){
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        final int [] l1 = { 2, 5, 8, 11, 14 };
       // final int [] l1 = { };
        final int [] l2 = { 1, 3, 5, 7 };
        //final int [] l2 = { };

        System.out.print("L1 ");
        printList(l1);
        System.out.print("L2 ");
        printList(l2);
        System.out.println("*** *** ***");
        System.out.print("Combined ");
        printList(combinePackageLists(l1, l2));
    }

}

package com.dimitar.algorithms.linkedlist;


// 2 numbers represented by a linked list
// (8 -> 2 -> 5) + (4 -> 9 -> 2) That is 528 +  294
// Output 2 -> 2 -> 8 That is 822
// Do the sum
public class SumLists {


    public static LinkedList<Integer> sum(final LinkedList<Integer> list1, final LinkedList<Integer> list2) {
        final LinkedList<Integer> result = new LinkedListImpl<>();

        LinkedListImpl.Node ptrFirst = list1.getFirst();
        LinkedListImpl.Node ptrSecond = list2.getFirst();

        int carry = 0;
        while (ptrFirst != null || ptrSecond != null) {
            final int valFirst = ptrFirst != null ? (int) ptrFirst.data : 0;
            final int valSecond = ptrSecond != null ? (int) ptrSecond.data : 0;

            int sum = carry + valFirst + valSecond;
            carry = 0;

            if (sum >= 10) {
                carry = 1;
                sum = sum % 10;
            }

            result.addBack(sum);

            ptrFirst = ptrFirst != null ? ptrFirst.next : null;
            ptrSecond = ptrSecond != null ? ptrSecond.next : null;
        }

        if (carry > 0) {
            result.addBack(carry);
        }

        return result;
    }

    public static void main(String[] args) {
        final LinkedList<Integer> list1 = new LinkedListImpl<>();
        final LinkedList<Integer> list2 = new LinkedListImpl<>();

        list1.addBack(8);
        list1.addBack(2);
        list1.addBack(5);

        list2.addBack(4);
        list2.addBack(9);
        list2.addBack(2);

        final LinkedList<Integer> sum = sum(list1, list2);
        ((LinkedListImpl)sum).print();
    }
}

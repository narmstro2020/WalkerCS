package org.WalkerCC_CompSci;

import java.util.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {

    int[] ints = new int[15];
    ints[0] = 10;
    ints[1] = 9;
    ints[2] = 8;
    ints[3] = 7;
    ints[4] = 6;
    ints[5] = 5;
    ints[6] = 4;
    ints[7] = 3;
    ints[8] = 2;
    ints[9] = 1;

    printIntArray(ints);

    LinkedList<Integer> linkedListInts = new LinkedList<Integer>();

    linkedListInts.

    ArrayList<Integer> arrayListInts = new ArrayList<Integer>();
    arrayListInts.add(5);
    arrayListInts.add(6);
    arrayListInts.add(7);
    arrayListInts.add(8);
    arrayListInts.add(9);
    System.out.println();
    printIntArrayList(arrayListInts);
    arrayListInts.remove(2);
    System.out.println();
    printIntArrayList(arrayListInts);
    arrayListInts.add(1, -50);
    System.out.println();
    printIntArrayList(arrayListInts);
    arrayListInts.set(2, -75);
    System.out.println();
    printIntArrayList(arrayListInts);
    List<Integer> thing = arrayListInts.subList(2, 5);
    System.out.println();
    printIntList(thing);
    Object[] thingy = arrayListInts.toArray();




    }


    private static void printIntArray(int[] ints) {
        for(int i = 0; i < ints.length; i++){
            System.out.print(ints[i]);
            System.out.print(", ");
        }
    }

    private static void printIntArrayList(ArrayList<Integer> ints) {
        for(int i = 0; i < ints.size(); i++){
            System.out.print(ints.get(i));
            System.out.print(", ");
        }
    }

    private static void printIntList(List<Integer> ints) {
        for(int i = 0; i < ints.size(); i++){
            System.out.print(ints.get(i));
            System.out.print(", ");
        }
    }


}

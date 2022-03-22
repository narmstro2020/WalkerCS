package org.WalkerCC_CompSci;

import javafx.collections.transformation.SortedList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        HashSet<String> cars = new HashSet<String>();

        cars.add("Ford");
        cars.add("B&W");
        cars.add("Chevrolet");
        cars.add("Mazda");
        cars.add("Toyota");
        cars.add("Honda");
        cars.add("Honda");

        System.out.println(cars);


        ArrayList<String> names = new ArrayList<String>();
        names.add("Fred");
        names.add("Wilma");
        names.add("Barney");
        names.add("Betty");
        names.add("Fred");
        names.add("Betty");
        names.add("Pebbles");
        names.add("Bam-Bam");

        HashSet<String> uniqueNames = new HashSet<String>();

        for(String i : names){
            uniqueNames.add(i);
        }

        HashMap<String, Integer> nameCounts = new HashMap<String, Integer>();

        for(String i : uniqueNames){
            nameCounts.put(i, 0);
        }

        for(String i : names){
            int count = nameCounts.get(i);
            count++;
            nameCounts.put(i, count);
        }

        System.out.println(nameCounts);


        System.out.println(uniqueNames);

        SortedList<String> charley = new SortedList<String>();






    }
}

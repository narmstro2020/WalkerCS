package org.WalkerCC_CompSci;

public class Main {

    public static void main(String[] args) {

        Rank rank1 = new Rank(Title.GENERAL);
        Rank rank2 = new Rank(Title.CAPTAIN);
        Rank rank3 = new Rank(Title.SERGEANT);
        Rank rank4 = new Rank(Title.PRIVATE);

        System.out.println(rank1.compareTo(rank2));
        System.out.println(rank3.compareTo(rank2));


    }
}

package org.WalkerCC_CompSci;

public class Main {

    public static void main(String[] args) {

        //Fraction 1/5
        Fraction oneFifth = new Fraction(1, 5);
        Fraction anotherFraction = new Fraction(2, 10);

        System.out.println(oneFifth.compareTo(anotherFraction));
        System.out.println(anotherFraction.compareTo(oneFifth));
        System.out.println(anotherFraction.equals(oneFifth));
    }
}

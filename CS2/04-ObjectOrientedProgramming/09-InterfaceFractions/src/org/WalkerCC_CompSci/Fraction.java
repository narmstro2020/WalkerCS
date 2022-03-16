package org.WalkerCC_CompSci;

import java.util.Objects;

public class Fraction implements Comparable<Fraction> {

    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public double toDecimal(){
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fraction fraction = (Fraction) o;
        return this.denominator * fraction.numerator == this.numerator * fraction.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    @Override
    public int compareTo(Fraction theOther) {
        if(this.denominator == theOther.denominator){
            return this.numerator - theOther.numerator;
        }
        else{
            int newthisnumerator = this.numerator * theOther.denominator;
            int theOthernewnumerator = theOther.numerator * this.denominator;
            return newthisnumerator - theOthernewnumerator;
        }
    }
}

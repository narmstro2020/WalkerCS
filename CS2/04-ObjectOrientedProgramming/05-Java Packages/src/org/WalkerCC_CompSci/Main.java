package org.WalkerCC_CompSci;


import java.math.BigInteger;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {

        GregorianCalendar calendar1 = new GregorianCalendar(2023, 0, 1, 0, 0, 0);

        System.out.println(calendar1.isLeapYear(2100));

        //Math.pow(2, 1) = 2 ^1
        //Java.lang.math

        //Java.math gives us BigInteger and BigDecimal classes


        BigInteger bigInteger1 = new BigInteger("34523452345234592837402938740239874");
        BigInteger bigInteger2 = new BigInteger("23408572304985720439587043985720396");

        BigInteger bigIntegerSum = bigInteger1.add(bigInteger2);
        System.out.println(bigIntegerSum);
    }
}

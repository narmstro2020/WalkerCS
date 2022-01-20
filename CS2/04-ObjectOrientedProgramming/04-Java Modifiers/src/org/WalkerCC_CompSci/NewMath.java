package org.WalkerCC_CompSci;

//Static Stuff
public class NewMath {

    public static final double E = 2.718;
    public static final double PI = 3.14;

    private NewMath(){

    }

    public static double abs(double a){
        if(a >= 0){
            return a;
        }
        else{
            return -a;
        }
    }

    public static int abs(int a){
        if(a >= 0){
            return a;
        }
        else{
            return -a;
        }
    }


    public static int max(int a, int b) {
        if(a > b){
            return a;
        }
        else{
            return b;
        }
    }

    public static double max(double a, double b) {
        if(a > b){
            return a;
        }
        else{
            return b;
        }
    }
}

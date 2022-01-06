package org.WalkerCC_CompSci;

public class Main {

    public static void main(String[] args) {
       Circle circle1 = new Circle("Circle1", 5);

       System.out.println(circle1);

       circle1.setRadius(10);
       System.out.println(circle1);

        System.out.println(circle1.getName() + " has a diameter of " + circle1.Diameter());
        System.out.println(circle1.getName() + " has a circumference of " + circle1.Circumference());
        System.out.println(circle1.getName() + " has a area of " + circle1.Area());
    }
}

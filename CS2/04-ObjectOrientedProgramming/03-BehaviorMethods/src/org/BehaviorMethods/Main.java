package org.BehaviorMethods;

public class Main {

    public static void main(String[] args) {
       Circle circle1 = new Circle("Circle1", 5);
       Circle circle2 = circle1;
       circle2.setRadius(2);


        System.out.println(circle1.getName() + " has a diameter of " + circle1.Diameter());
        System.out.println(circle1.getName() + " has a circumference of " + circle1.Circumference());
        System.out.println(circle1.getName() + " has a area of " + circle1.Area());
        System.out.println();
        System.out.println(circle2.getName() + " has a diameter of " + circle2.Diameter());
        System.out.println(circle2.getName() + " has a circumference of " + circle2.Circumference());
        System.out.println(circle2.getName() + " has a area of " + circle2.Area());
    }
}

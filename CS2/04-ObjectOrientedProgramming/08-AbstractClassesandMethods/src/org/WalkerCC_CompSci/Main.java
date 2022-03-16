package org.WalkerCC_CompSci;

public class Main {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Pig pig1 = new Pig();
        Cat cat1 = new Cat();
        Horse horse1 = new Horse();

        dog1.setName("Fido");
        pig1.setName("Napoleon");
        cat1.setName("Mork");
        horse1.setName("Ed");

        dog1.makeSound();
        pig1.makeSound();

        dog1.sleepSound();
        cat1.sleepSound();
        pig1.sleepSound();
        horse1.sleepSound();

    }
}

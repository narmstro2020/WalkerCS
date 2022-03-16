package org.WalkerCC_CompSci;

public class Horse extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Neigh, Neigh!");
    }

    @Override
    public void sleepSound(){
        System.out.println("ZZZZZ");
    }
}

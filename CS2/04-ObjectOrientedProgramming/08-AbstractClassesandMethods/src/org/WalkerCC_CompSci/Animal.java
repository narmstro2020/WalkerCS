package org.WalkerCC_CompSci;

public abstract class Animal {
    private String name;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public abstract void makeSound();

    public void sleepSound(){
        System.out.println("zzz");
    }


}

package org.WalkerCC_CompSci;

public class Car extends Vehicle{
    private String model = "Mustang";

    public String getMake() {
        return this.make;
    }

    public String getModel(){
        return this.model;
    }
}

//Car is a subclass of Vehicle
// Vehicle is Car's superclass
//You can only inherit from one class.
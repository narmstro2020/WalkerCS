package org.BehaviorMethods;

public class Circle {
    //Field (Attributes) marked private because we should access by Getters and Setters
    private double radius;
    private String name;

    //Constructor:  public "name of the Class"(input parameters)
    public Circle(String name, double radius){
        this.name = name;
        this.radius = radius;
    }

    //getter Method that gets the radius:  return type double.  public of course
    public double getRadius(){
        return this.radius;
    }

    //setter Method that sets the radius:  return type void.  public of course
    public void setRadius(double radius){
        this.radius = radius;
    }

    //getter Method the gets the name:  return type String.  public of course.
    //Never allowed to be set
    public String getName(){
        return this.name;
    }

    //toString method for Class
    public String toString(){
        String outputString = "";

        outputString += this.name;
        outputString += " ";
        outputString += "has a radius of";
        outputString += " ";
        outputString += this.radius;

        return outputString;
    }

    //Behavior Methods for Diameter, Circumference, Area
    public double Diameter(){
        return 2 * this.radius;
    }

    public double Circumference(){
        return 2 * Math.PI * this.radius;
    }

    public double Area(){
        return Math.PI * Math.pow(this.radius, 2);
    }

}

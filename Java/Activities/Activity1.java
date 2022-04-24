package org.example;

public class Activity1 {
    public static void main(String[] args)
    {
        //create a  new instance of the car.
        Car carName = new Car();
        //set the members of the given instance.
        carName.color = "Black";
        carName.transmission="Manual";
        carName.make=2014;
        //Invoke the class methods by using an instance.
        carName.displayCharacteristics();
        carName.accelerate();
        carName.brake();
    }
}
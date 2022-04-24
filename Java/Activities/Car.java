package org.example;

public class Car {
    //declare the class membters.
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;
    //create the constructor.
    public Car()
    {
        tyres=4;
        doors=4;
    }
    //method to display the car characteristics.
    void displayCharacteristics()
    {
        System.out.println("Color of the car is : " + color);
        System.out.println("Transmission of the car is : " + transmission);
        System.out.println("Make of the car is : " + make);
        System.out.println("NO of tyres of the car is : " + tyres);
        System.out.println("NO of doors of the car is : " + doors);

    }
    //method do demonstrate accelerate function.
    void accelerate()
    {
        System.out.println("Car is moving forward.");
    }
    //method to demonstrate brake function.
    void brake()
    {
        System.out.println("Car has stopped.");
    }
}

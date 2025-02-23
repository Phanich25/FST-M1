package org.example;

public class Activity3 {
    public static void main(String[] args)
    {
        //Initialize the seconds variable.
        double seconds = 1000000000;
        //Initialize different variables to store the time of all the planets.
        double EarthSeconds = 31557600;
        double MercurySeconds = 0.2408467;
        double VenusSeconds = 0.61519726;
        double MarsSeconds = 1.8808158;
        double JupiterSeconds = 11.862615;
        double SaturnSeconds = 29.447498;
        double UranusSeconds = 84.016846;
        double NeptuneSeconds = 164.79132;
        //Print the age of all planets based on the values given above.
        System.out.println("Age on Mercury: " + seconds / EarthSeconds / MercurySeconds);
        System.out.println("Age on Earth: " + seconds / EarthSeconds);
        System.out.println("Age on Venus: " + seconds / EarthSeconds / VenusSeconds);
        System.out.println("Age on Mars: " + seconds / EarthSeconds / MarsSeconds);
        System.out.println("Age on Jupiter: " + seconds / EarthSeconds / JupiterSeconds);
        System.out.println("Age on Saturn: " + seconds / EarthSeconds / SaturnSeconds);
        System.out.println("Age on Uranus: " + seconds / EarthSeconds / UranusSeconds);
        System.out.println("Age on Neptune: " + seconds / EarthSeconds / NeptuneSeconds);
    }
}
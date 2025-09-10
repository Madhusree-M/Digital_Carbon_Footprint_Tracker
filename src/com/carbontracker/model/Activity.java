package com.carbontracker.model;
import java.util.Scanner;

public abstract class Activity {
    protected String type;
    protected double emission;

    //Abstraction
    public abstract void inputData(Scanner sc);
    public abstract void calculateEmission();

    public void displayResult() 
    {
        System.out.println("Activity: " + type);
        System.out.println("CO₂ Emission: " + emission + " kg");
    }

    public double getEmission() 
    {
        return emission;
    }
}

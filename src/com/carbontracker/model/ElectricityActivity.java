package com.carbontracker.model;

import java.util.Scanner;

public class ElectricityActivity extends Activity{
    private double units;   // electricity units consumed (kWh)
    private final double EMISSION_FACTOR = 0.85; // kg CO2 per kWh

    // Method to input electricity data
    public void inputData(Scanner sc) 
    {
        System.out.print("Enter electricity units consumed (kWh): ");
        units = sc.nextDouble();
    }

    // Method to calculate CO2 emissions
    public void calculateEmission() 
    {
        emission = units * EMISSION_FACTOR;
    }

    // Getter for units
    public double getUnits() 
    {
        return units;
    }

    // Display results
    public void displayResult() 
    {
        System.out.println("Electricity Usage: " + units + " kWh");
        System.out.println("Estimated Emissions: " + getEmission() + " kg CO2");

    }
}

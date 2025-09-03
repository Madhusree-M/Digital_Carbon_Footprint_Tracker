package com.carbontracker.model;

import java.util.Scanner;

public class ElectricityActivity {
    private double units;   // electricity units consumed (kWh)
    private final double EMISSION_FACTOR = 0.85; // kg CO2 per kWh

    // Method to input electricity data
    public void inputElectricityData() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter electricity units consumed (kWh): ");
        units = sc.nextDouble();
    }

    // Method to calculate CO2 emissions
    public double calculateEmissions() 
    {
        return units * EMISSION_FACTOR;
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
        System.out.println("Estimated Emissions: " + calculateEmissions() + " kg CO2");

    }
}

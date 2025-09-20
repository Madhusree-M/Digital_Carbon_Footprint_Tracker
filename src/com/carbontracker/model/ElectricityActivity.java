package com.carbontracker.model;

import java.util.Scanner;

public class ElectricityActivity extends Activity{
    private double units;   // electricity units consumed (kiloWatthour - kWh)
    private final double EMISSION_FACTOR = 0.85; // kg CO2 per kWh

    
    public void inputData(Scanner sc) 
    {
        System.out.print("Enter electricity units: ");
        units = sc.nextDouble();
    }

    public void calculateEmission() 
    {
        emission = units * EMISSION_FACTOR;
    }

    @Override
    public void displayResult() 
    {
        System.out.println("Electricity Usage: " + units + " kWh");
        System.out.println("Estimated Emissions: " + emission + " kg CO2");

    }
}
